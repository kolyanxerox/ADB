package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class dm0 extends AbstractSet {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18271OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ fm0 f18272OooOo0o;

    public /* synthetic */ dm0(fm0 fm0Var, int i) {
        this.f18271OooOo0O = i;
        this.f18272OooOo0o = fm0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f18271OooOo0O) {
            case 0:
                this.f18272OooOo0o.clear();
                break;
            default:
                this.f18272OooOo0o.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f18271OooOo0O) {
            case 0:
                fm0 fm0Var = this.f18272OooOo0o;
                Map mapOooO0o = fm0Var.OooO0o();
                if (mapOooO0o != null) {
                    return mapOooO0o.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iOooOO0 = fm0Var.OooOO0(entry.getKey());
                    if (iOooOO0 != -1 && ii0.OooOOoo(fm0Var.OooO0OO()[iOooOO0], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f18272OooOo0o.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f18271OooOo0O) {
            case 0:
                fm0 fm0Var = this.f18272OooOo0o;
                Map mapOooO0o = fm0Var.OooO0o();
                return mapOooO0o != null ? mapOooO0o.entrySet().iterator() : new cm0(fm0Var, 1);
            default:
                fm0 fm0Var2 = this.f18272OooOo0o;
                Map mapOooO0o2 = fm0Var2.OooO0o();
                return mapOooO0o2 != null ? mapOooO0o2.keySet().iterator() : new cm0(fm0Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f18271OooOo0O) {
            case 0:
                fm0 fm0Var = this.f18272OooOo0o;
                Map mapOooO0o = fm0Var.OooO0o();
                if (mapOooO0o != null) {
                    return mapOooO0o.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!fm0Var.OooO0oo()) {
                        int iOooO = fm0Var.OooO();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = fm0Var.f18973OooOo0O;
                        Objects.requireNonNull(obj2);
                        int iOooOoO0 = ii0.OooOoO0(key, value, iOooO, obj2, fm0Var.OooO00o(), fm0Var.OooO0O0(), fm0Var.OooO0OO());
                        if (iOooOoO0 != -1) {
                            fm0Var.OooO0oO(iOooOoO0, iOooO);
                            fm0Var.f18977OooOoOO--;
                            fm0Var.f18975OooOoO += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                fm0 fm0Var2 = this.f18272OooOo0o;
                Map mapOooO0o2 = fm0Var2.OooO0o();
                return mapOooO0o2 != null ? mapOooO0o2.keySet().remove(obj) : fm0Var2.OooOO0o(obj) != fm0.f18971OooOooo;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f18271OooOo0O) {
        }
        return this.f18272OooOo0o.size();
    }
}
