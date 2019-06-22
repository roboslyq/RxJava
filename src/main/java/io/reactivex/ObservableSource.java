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

import io.reactivex.annotations.*;

/**
 * Represents a basic, non-backpressured {@link Observable} source base interface,
 * consumable via an {@link Observer}.
 * 一个生产者(Observable)的父接口，可供消费者(Observer)对其生产的元素进行消费。
 * 此生产者无背压功能
 * @param <T> the element type
 * @since 2.0
 */
public interface ObservableSource<T> {

    /**
     * Subscribes the given Observer to this ObservableSource instance.
     * @param observer the Observer, not null
     * @throws NullPointerException if {@code observer} is null
     * 订阅者/消费者发起订阅
     */
    void subscribe(@NonNull Observer<? super T> observer);
}
