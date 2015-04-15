// Copyright 2015-04-13 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package org.organicdesign.fp.collections;

import org.organicdesign.fp.permanent.Sequence;

public interface ImSet<E> extends UnSet<E>, Sequence<E> {
    ImSet<E> put(E e);

    ImSet<E> disjoin(E key);

    /**
     * This method goes against Josh Bloch's Item 25: "Prefer Lists to Arrays", but is provided for backwards
     * compatibility in some performance-critical situations.  If you really need an array, consider using the somewhat
     * type-safe version of this method instead, but read the caveats first.
     * {@inheritDoc}
     */
    @Override default Object[] toArray() { return UnCollection.toArray(this); }

    // ================================================ STATIC METHODS ================================================
    static <T> ImSet<T> empty() { return PersistentTreeSet.empty(); }
}
