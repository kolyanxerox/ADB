package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class oO0O00o0 extends AbstractSet {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26735OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f26736OooOo0o;

    public /* synthetic */ oO0O00o0(AbstractMap abstractMap, int i) {
        this.f26735OooOo0O = i;
        this.f26736OooOo0o = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f26735OooOo0O) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((oO0O000o) this.f26736OooOo0o).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o).put((Comparable) entry2.getKey(), entry2.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f26735OooOo0O) {
            case 0:
                ((oO0O000o) this.f26736OooOo0o).clear();
                break;
            default:
                ((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f26735OooOo0O) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((oO0O000o) this.f26736OooOo0o).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f26735OooOo0O) {
            case 0:
                return new oO0O00O((oO0O000o) this.f26736OooOo0o);
            default:
                return new oO0O00O((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f26735OooOo0O) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((oO0O000o) this.f26736OooOo0o).remove(entry.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o).remove(entry2.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f26735OooOo0O) {
            case 0:
                return ((oO0O000o) this.f26736OooOo0o).size();
            default:
                return ((com.google.protobuf.o0O0O0Oo) this.f26736OooOo0o).size();
        }
    }
}
