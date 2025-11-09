package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0oOO implements o0O00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f27170OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o0oOO f27163OooO0O0 = new o0oOO(0);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o0oOO f27164OooO0OO = new o0oOO(1);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oOO f27165OooO0Oo = new o0oOO(2);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o0oOO f27167OooO0o0 = new o0oOO(3);

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o0oOO f27166OooO0o = new o0oOO(4);

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final o0oOO f27168OooO0oO = new o0oOO(5);

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final o0oOO f27169OooO0oo = new o0oOO(6);

    /* renamed from: OooO, reason: collision with root package name */
    public static final o0oOO f27162OooO = new o0oOO(7);

    public /* synthetic */ o0oOO(int i) {
        this.f27170OooO00o = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00O
    public final boolean OooO00o(int i) {
        switch (this.f27170OooO00o) {
            case 0:
                switch (i) {
                }
            case 1:
                switch (i) {
                    default:
                        switch (i) {
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
            case 2:
                if (o0O000Oo.OooOOO0(i) != 0) {
                }
                break;
            case 3:
                if ((i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : o0oo0000.ALTERNATIVE_BILLING_ACTION : o0oo0000.LOCAL_PURCHASES_UPDATED_ACTION : o0oo0000.PURCHASES_UPDATED_ACTION : o0oo0000.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 4:
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                }
                break;
            case 5:
                if (i != 17 && i != 18) {
                    switch (i) {
                    }
                }
                break;
            case 6:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                }
                break;
            default:
                if (i == 0 || i == 1) {
                }
                break;
        }
        return true;
    }
}
