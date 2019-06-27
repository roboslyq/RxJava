/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package io.reactivex.disposables;

/**
 * Represents a disposable resource.
 * Dispose 翻译过来有销毁，释放，清理的意思。那么Disposable代表有"释放能力"资源。即表示订阅可主动撤销/取消的能力。
 *
 * rxjava虽然好用，但是总所周知，容易遭层内存泄漏。也就说在订阅了事件后没有及时取阅，导致在activity或者fragment销毁后仍然占用着内存，无法释放。
 * 而disposable便是这个订阅事件，可以用来取消订阅。但是在什么时候取消订阅呢？我知道有两种方式:
 *  1、使用CompositeDisposable
 *  2、在oError和onComplete后调用disposable.dispose()
 */
public interface Disposable {
    /**
     * Dispose the resource, the operation should be idempotent.
     * 取消/撤销订阅
     */
    void dispose();

    /**
     * Returns true if this resource has been disposed.
     * @return true if this resource has been disposed
     * 查询订阅状态： true 代表已经取消/撤销。false表示正常订阅
     */
    boolean isDisposed();
}
