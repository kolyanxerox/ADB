package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0O00O implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f26730OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26731OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f26732OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f26733OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f26734OooOoO0;

    public /* synthetic */ oO0O00O(oO0O000o oo0o000o) {
        this.f26731OooOo0O = 0;
        Objects.requireNonNull(oo0o000o);
        this.f26733OooOoO = oo0o000o;
        this.f26732OooOo0o = -1;
    }

    public Iterator OooO00o() {
        if (this.f26734OooOoO0 == null) {
            this.f26734OooOoO0 = ((com.google.protobuf.o0O0O0Oo) this.f26733OooOoO).f28318OooOo.entrySet().iterator();
        }
        return this.f26734OooOoO0;
    }

    public Iterator OooO0O0() {
        if (this.f26734OooOoO0 == null) {
            this.f26734OooOoO0 = ((oO0O000o) this.f26733OooOoO).f26724OooOo.entrySet().iterator();
        }
        return this.f26734OooOoO0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26731OooOo0O) {
            case 0:
                int i = this.f26732OooOo0o + 1;
                oO0O000o oo0o000o = (oO0O000o) this.f26733OooOoO;
                if (i >= oo0o000o.f26726OooOo0o) {
                    return !oo0o000o.f26724OooOo.isEmpty() && OooO0O0().hasNext();
                }
                return true;
            default:
                int i2 = this.f26732OooOo0o + 1;
                com.google.protobuf.o0O0O0Oo o0o0o0oo = (com.google.protobuf.o0O0O0Oo) this.f26733OooOoO;
                if (i2 >= o0o0o0oo.f28320OooOo0o.size()) {
                    return !o0o0o0oo.f28318OooOo.isEmpty() && OooO00o().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26731OooOo0O) {
            case 0:
                this.f26730OooOo = true;
                int i = this.f26732OooOo0o + 1;
                this.f26732OooOo0o = i;
                oO0O000o oo0o000o = (oO0O000o) this.f26733OooOoO;
                return i < oo0o000o.f26726OooOo0o ? (oO0O00) oo0o000o.f26725OooOo0O[i] : (Map.Entry) OooO0O0().next();
            default:
                this.f26730OooOo = true;
                int i2 = this.f26732OooOo0o + 1;
                this.f26732OooOo0o = i2;
                com.google.protobuf.o0O0O0Oo o0o0o0oo = (com.google.protobuf.o0O0O0Oo) this.f26733OooOoO;
                return i2 < o0o0o0oo.f28320OooOo0o.size() ? (Map.Entry) o0o0o0oo.f28320OooOo0o.get(this.f26732OooOo0o) : (Map.Entry) OooO00o().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f26733OooOoO;
        switch (this.f26731OooOo0O) {
            case 0:
                if (!this.f26730OooOo) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f26730OooOo = false;
                oO0O000o oo0o000o = (oO0O000o) abstractMap;
                oo0o000o.OooO0oO();
                int i = this.f26732OooOo0o;
                if (i >= oo0o000o.f26726OooOo0o) {
                    OooO0O0().remove();
                    return;
                } else {
                    this.f26732OooOo0o = i - 1;
                    oo0o000o.OooO0Oo(i);
                    return;
                }
            default:
                if (!this.f26730OooOo) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f26730OooOo = false;
                int i2 = com.google.protobuf.o0O0O0Oo.f28317OooOoo;
                com.google.protobuf.o0O0O0Oo o0o0o0oo = (com.google.protobuf.o0O0O0Oo) abstractMap;
                o0o0o0oo.OooO0O0();
                if (this.f26732OooOo0o >= o0o0o0oo.f28320OooOo0o.size()) {
                    OooO00o().remove();
                    return;
                }
                int i3 = this.f26732OooOo0o;
                this.f26732OooOo0o = i3 - 1;
                o0o0o0oo.OooO0oo(i3);
                return;
        }
    }

    public oO0O00O(com.google.protobuf.o0O0O0Oo o0o0o0oo) {
        this.f26731OooOo0O = 1;
        this.f26733OooOoO = o0o0o0oo;
        this.f26732OooOo0o = -1;
    }
}
