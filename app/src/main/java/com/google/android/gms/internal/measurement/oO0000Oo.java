package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class oO0000Oo implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f26669OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26670OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f26671OooOo0o = 0;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f26672OooOoO0;

    public oO0000Oo(oO000 oo000) {
        this.f26672OooOoO0 = oo000;
        this.f26669OooOo = oo000.OooO0oO();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26670OooOo0O) {
            case 0:
                if (this.f26671OooOo0o < this.f26669OooOo) {
                }
                break;
            case 1:
                if (this.f26671OooOo0o < this.f26669OooOo) {
                }
                break;
            default:
                if (this.f26671OooOo0o < this.f26669OooOo) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26670OooOo0O) {
            case 0:
                int i = this.f26671OooOo0o;
                if (i >= this.f26669OooOo) {
                    throw new NoSuchElementException();
                }
                this.f26671OooOo0o = i + 1;
                return Byte.valueOf(((oO000) this.f26672OooOoO0).OooO0o(i));
            case 1:
                int i2 = this.f26671OooOo0o;
                if (i2 >= this.f26669OooOo) {
                    throw new NoSuchElementException();
                }
                this.f26671OooOo0o = i2 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.o0O00000) this.f26672OooOoO0).OooO0o(i2));
            default:
                int i3 = this.f26671OooOo0o;
                if (i3 >= this.f26669OooOo) {
                    throw new NoSuchElementException();
                }
                this.f26671OooOo0o = i3 + 1;
                return Byte.valueOf(((com.google.crypto.tink.shaded.protobuf.OooOO0O) this.f26672OooOoO0).OooOO0o(i3));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26670OooOo0O) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public oO0000Oo(com.google.android.gms.internal.play_billing.o0O00000 o0o00000) {
        this.f26672OooOoO0 = o0o00000;
        this.f26669OooOo = o0o00000.OooO0oO();
    }

    public oO0000Oo(com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        this.f26672OooOoO0 = oooOO0O;
        this.f26669OooOo = oooOO0O.size();
    }
}
