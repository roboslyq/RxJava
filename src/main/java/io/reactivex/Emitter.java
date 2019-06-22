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
package io.reactivex;

import io.reactivex.annotations.NonNull;

/**
 * Base interface for emitting signals in a push-fashion in various generator-like source
 * operators (create, generate).
 * 以推的形式发送一系列信息（消息）
 * <p>
 * Note that the {@link Emitter#onNext}, {@link Emitter#onError} and
 * {@link Emitter#onComplete} methods provided to the function via the {@link Emitter} instance should be called synchronously,
 * never concurrently. Calling them from multiple threads is not supported and leads to an
 * undefined behavior.
 * 同步事件发射器（千万不要异步使用）
 * @param <T> the value type emitted
 */
public interface Emitter<T> {

    /**
     * Signal a normal value.
     * @param value the value to signal, not null
     * 发送一个正常的值
     */
    void onNext(@NonNull T value);

    /**
     * Signal a Throwable exception.
     * @param error the Throwable to signal, not null
     * 发送一个Throwable异常
     */
    void onError(@NonNull Throwable error);

    /**
     * Signal a completion.
     * 发送一个完成信号
     */
    void onComplete();
}
