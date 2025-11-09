package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class gl0 implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final CharSequence f19377OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public String f19378OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f19379OooOo0o = 2;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f19381OooOoO0 = 0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f19380OooOoO = Integer.MAX_VALUE;

    public gl0(CharSequence charSequence) {
        this.f19377OooOo = charSequence;
    }

    public abstract int OooO00o(int i);

    public abstract int OooO0O0(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iOooO00o;
        int i = this.f19379OooOo0o;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f19379OooOo0o = 4;
            int i3 = this.f19381OooOoO0;
            while (true) {
                int i4 = this.f19381OooOoO0;
                if (i4 == -1) {
                    this.f19379OooOo0o = 3;
                    break;
                }
                int iOooO0O0 = OooO0O0(i4);
                CharSequence charSequence = this.f19377OooOo;
                if (iOooO0O0 == -1) {
                    iOooO0O0 = charSequence.length();
                    this.f19381OooOoO0 = -1;
                    iOooO00o = -1;
                } else {
                    iOooO00o = OooO00o(iOooO0O0);
                    this.f19381OooOoO0 = iOooO00o;
                }
                if (iOooO00o == i3) {
                    int i5 = iOooO00o + 1;
                    this.f19381OooOoO0 = i5;
                    if (i5 > charSequence.length()) {
                        this.f19381OooOoO0 = -1;
                    }
                } else {
                    if (i3 < iOooO0O0) {
                        charSequence.charAt(i3);
                    }
                    if (i3 < iOooO0O0) {
                        charSequence.charAt(iOooO0O0 - 1);
                    }
                    int i6 = this.f19380OooOoO;
                    if (i6 == 1) {
                        iOooO0O0 = charSequence.length();
                        this.f19381OooOoO0 = -1;
                        if (iOooO0O0 > i3) {
                            charSequence.charAt(iOooO0O0 - 1);
                        }
                    } else {
                        this.f19380OooOoO = i6 - 1;
                    }
                    string = charSequence.subSequence(i3, iOooO0O0).toString();
                }
            }
            this.f19378OooOo0O = string;
            if (this.f19379OooOo0o != 3) {
                this.f19379OooOo0o = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19379OooOo0o = 2;
        String str = this.f19378OooOo0O;
        this.f19378OooOo0O = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
