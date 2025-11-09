package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.j4 */
/* loaded from: classes.dex */
public class C1065j4 implements Set, RandomAccess {

    /* renamed from: a */
    private final ArrayList f944a = new ArrayList();

    /* renamed from: b */
    private final HashSet f945b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(m1055a()) > 0) {
            this.f944a.add(comparable);
        } else {
            this.f944a.add(m1059b(comparable), comparable);
        }
        return this.f945b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public Comparable m1060b(int i) {
        Comparable comparable = (Comparable) this.f944a.remove(i);
        this.f945b.remove(comparable);
        return comparable;
    }

    /* renamed from: c */
    public int m1061c(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f944a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableM1056a = m1056a(iBinarySearch);
        while (iBinarySearch < size() && comparableM1056a == m1056a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f944a.clear();
        this.f945b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f945b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f945b.containsAll(collection);
    }

    /* renamed from: d */
    public int m1062d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return m1059b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f944a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f944a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iM1062d = m1062d((Comparable) obj);
        if (iM1062d == -1) {
            return false;
        }
        this.f944a.remove(iM1062d);
        return this.f945b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f944a.get(size);
            if (!collection.contains(comparable)) {
                this.f944a.remove(size);
                this.f945b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f944a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f944a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f944a.toArray(objArr);
    }

    /* renamed from: b */
    public int m1059b(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f944a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableM1056a = m1056a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableM1056a == m1056a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    /* renamed from: a */
    public Comparable m1056a(int i) {
        return (Comparable) this.f944a.get(i);
    }

    /* renamed from: a */
    public void m1057a(int i, Comparable comparable) {
        this.f945b.remove((Comparable) this.f944a.get(i));
        this.f944a.set(i, comparable);
        this.f945b.add(comparable);
    }

    /* renamed from: a */
    public Comparable m1055a() {
        return (Comparable) this.f944a.get(size() - 1);
    }
}
