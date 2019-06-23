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

package io.reactivex.internal.fuseable;

import io.reactivex.ObservableSource;

/**
 * Interface indicating the implementor has an upstream ObservableSource-like source available
 * via {@link #source()} method.
 * 有前置可用流(链式调用均需要实现此接口，例如filter(),map()等)
 * @param <T> the value type
 */
public interface HasUpstreamObservableSource<T> {
    /**
     * Returns the upstream source of this Observable.
     * <p>Allows discovering the chain of observables.
     * 返回上前置流(ObservableSource)
     * @return the source ObservableSource
     */
    ObservableSource<T> source();
}
