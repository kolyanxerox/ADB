package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o00O extends AbstractList implements RandomAccess {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28227OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final LazyStringArrayList f28228OooOo0o;

    public /* synthetic */ o00O(LazyStringArrayList lazyStringArrayList, int i) {
        this.f28227OooOo0O = i;
        this.f28228OooOo0o = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        switch (this.f28227OooOo0O) {
            case 0:
                this.f28228OooOo0o.add(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                this.f28228OooOo0o.add(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.f28227OooOo0O) {
            case 0:
                return this.f28228OooOo0o.getByteArray(i);
            default:
                return this.f28228OooOo0o.getByteString(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.f28227OooOo0O) {
            case 0:
                String strRemove = this.f28228OooOo0o.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(strRemove);
            default:
                String strRemove2 = this.f28228OooOo0o.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(strRemove2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f28227OooOo0O) {
            case 0:
                Object andReturn = this.f28228OooOo0o.setAndReturn(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(andReturn);
            default:
                Object andReturn2 = this.f28228OooOo0o.setAndReturn(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(andReturn2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f28227OooOo0O) {
        }
        return this.f28228OooOo0o.size();
    }
}
