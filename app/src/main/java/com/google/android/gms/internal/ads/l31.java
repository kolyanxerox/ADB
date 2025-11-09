package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class l31 extends AbstractList {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final ii0 f20788OooOo = ii0.OooOoOO(l31.class);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ArrayList f20789OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final i31 f20790OooOo0o;

    public l31(ArrayList arrayList, i31 i31Var) {
        this.f20789OooOo0O = arrayList;
        this.f20790OooOo0o = i31Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f20789OooOo0O;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        i31 i31Var = this.f20790OooOo0o;
        if (!i31Var.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(i31Var.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k31(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        ii0 ii0Var = f20788OooOo;
        ii0Var.OooOOO("potentially expensive size() call");
        ii0Var.OooOOO("blowup running");
        while (true) {
            i31 i31Var = this.f20790OooOo0o;
            boolean zHasNext = i31Var.hasNext();
            ArrayList arrayList = this.f20789OooOo0O;
            if (!zHasNext) {
                return arrayList.size();
            }
            arrayList.add(i31Var.next());
        }
    }
}
