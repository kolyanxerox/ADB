package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class oO00O0oO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f22460OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f22461OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f22462OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22463OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f22465OooO0o0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public float f22469OooOO0O;
    public String OooOO0o;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public Layout.Alignment f22472OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public Layout.Alignment f22473OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public oO000o00 f22474OooOOo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f22464OooO0o = -1;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22466OooO0oO = -1;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22467OooO0oo = -1;

    /* renamed from: OooO, reason: collision with root package name */
    public int f22459OooO = -1;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f22468OooOO0 = -1;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f22471OooOOO0 = -1;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f22470OooOOO = -1;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public int f22475OooOOo0 = -1;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public float f22476OooOOoo = Float.MAX_VALUE;

    public final String OooO00o() {
        return this.OooOO0o;
    }

    public final void OooO0O0(oO00O0oO oo00o0oo) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (oo00o0oo != null) {
            if (!this.f22462OooO0OO && oo00o0oo.f22462OooO0OO) {
                this.f22461OooO0O0 = oo00o0oo.f22461OooO0O0;
                this.f22462OooO0OO = true;
            }
            if (this.f22467OooO0oo == -1) {
                this.f22467OooO0oo = oo00o0oo.f22467OooO0oo;
            }
            if (this.f22459OooO == -1) {
                this.f22459OooO = oo00o0oo.f22459OooO;
            }
            if (this.f22460OooO00o == null && (str = oo00o0oo.f22460OooO00o) != null) {
                this.f22460OooO00o = str;
            }
            if (this.f22464OooO0o == -1) {
                this.f22464OooO0o = oo00o0oo.f22464OooO0o;
            }
            if (this.f22466OooO0oO == -1) {
                this.f22466OooO0oO = oo00o0oo.f22466OooO0oO;
            }
            if (this.f22470OooOOO == -1) {
                this.f22470OooOOO = oo00o0oo.f22470OooOOO;
            }
            if (this.f22472OooOOOO == null && (alignment2 = oo00o0oo.f22472OooOOOO) != null) {
                this.f22472OooOOOO = alignment2;
            }
            if (this.f22473OooOOOo == null && (alignment = oo00o0oo.f22473OooOOOo) != null) {
                this.f22473OooOOOo = alignment;
            }
            if (this.f22475OooOOo0 == -1) {
                this.f22475OooOOo0 = oo00o0oo.f22475OooOOo0;
            }
            if (this.f22468OooOO0 == -1) {
                this.f22468OooOO0 = oo00o0oo.f22468OooOO0;
                this.f22469OooOO0O = oo00o0oo.f22469OooOO0O;
            }
            if (this.f22474OooOOo == null) {
                this.f22474OooOOo = oo00o0oo.f22474OooOOo;
            }
            if (this.f22476OooOOoo == Float.MAX_VALUE) {
                this.f22476OooOOoo = oo00o0oo.f22476OooOOoo;
            }
            if (!this.f22465OooO0o0 && oo00o0oo.f22465OooO0o0) {
                this.f22463OooO0Oo = oo00o0oo.f22463OooO0Oo;
                this.f22465OooO0o0 = true;
            }
            if (this.f22471OooOOO0 != -1 || (i = oo00o0oo.f22471OooOOO0) == -1) {
                return;
            }
            this.f22471OooOOO0 = i;
        }
    }
}
