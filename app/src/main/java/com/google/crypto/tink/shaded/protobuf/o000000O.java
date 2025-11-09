package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public final class o000000O extends OooO0O0 implements o00000, RandomAccess {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f28072OooOo0o;

    static {
        new o000000O(10).f28011OooOo0O = false;
    }

    public o000000O(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final void OooO0oo(OooOOO0 oooOOO0) {
        OooO0Oo();
        this.f28072OooOo0o.add(oooOOO0);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooO0Oo();
        this.f28072OooOo0o.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f28072OooOo0o.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0Oo();
        this.f28072OooOo0o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f28072OooOo0o;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof OooOOO0)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, oo0o0Oo.f28134OooO00o);
            o00O0O0O o00o0o0o = oo00o.f28133OooO00o;
            if (oo00o.f28133OooO00o.OooOOoo(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        oooOOO0.getClass();
        Charset charset = oo0o0Oo.f28134OooO00o;
        if (oooOOO0.size() == 0) {
            str = "";
        } else {
            OooOO0O oooOO0O = (OooOO0O) oooOOO0;
            str = new String(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size(), charset);
        }
        OooOO0O oooOO0O2 = (OooOO0O) oooOOO0;
        int iOooOO0O = oooOO0O2.OooOO0O();
        if (oo00o.f28133OooO00o.OooOOoo(oooOO0O2.f28016OooOoO0, iOooOO0O, oooOO0O2.size() + iOooOO0O)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final Object getRaw(int i) {
        return this.f28072OooOo0o.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f28072OooOo0o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final o00000 getUnmodifiableView() {
        return this.f28011OooOo0O ? new o00oOoo(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0OO00O
    public final o0OO00O mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.f28072OooOo0o;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new o000000O(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0Oo();
        Object objRemove = this.f28072OooOo0o.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof OooOOO0)) {
            return new String((byte[]) objRemove, oo0o0Oo.f28134OooO00o);
        }
        OooOOO0 oooOOO0 = (OooOOO0) objRemove;
        oooOOO0.getClass();
        Charset charset = oo0o0Oo.f28134OooO00o;
        if (oooOOO0.size() == 0) {
            return "";
        }
        OooOO0O oooOO0O = (OooOO0O) oooOOO0;
        return new String(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0Oo();
        Object obj2 = this.f28072OooOo0o.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof OooOOO0)) {
            return new String((byte[]) obj2, oo0o0Oo.f28134OooO00o);
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj2;
        oooOOO0.getClass();
        Charset charset = oo0o0Oo.f28134OooO00o;
        if (oooOOO0.size() == 0) {
            return "";
        }
        OooOO0O oooOO0O = (OooOO0O) oooOOO0;
        return new String(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28072OooOo0o.size();
    }

    public o000000O(ArrayList arrayList) {
        this.f28072OooOo0o = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        OooO0Oo();
        if (collection instanceof o00000) {
            collection = ((o00000) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f28072OooOo0o.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
