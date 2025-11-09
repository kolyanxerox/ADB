package Oooo00O;

import OooOooo.o000O00O;
import Oooo00o.o000O000;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class OooOOO extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<OooOOO> CREATOR = new OooOoo0.o000OOo(16);

    /* renamed from: Oooo0, reason: collision with root package name */
    public static final Scope[] f13763Oooo0 = new Scope[0];

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final o000O00O[] f13764Oooo0O0 = new o000O00O[0];

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f13765OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13766OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f13767OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public IBinder f13768OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f13769OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public Scope[] f13770OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public Account f13771OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public Bundle f13772OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public o000O00O[] f13773OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public o000O00O[] f13774OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final boolean f13775Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final int f13776Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f13777Oooo00o;

    @Nullable
    private final String zzp;

    public OooOOO(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, o000O00O[] o000o00oArr, o000O00O[] o000o00oArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f13763Oooo0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        o000O00O[] o000o00oArr3 = f13764Oooo0O0;
        o000O00O[] o000o00oArr4 = o000o00oArr == null ? o000o00oArr3 : o000o00oArr;
        o000o00oArr3 = o000o00oArr2 != null ? o000o00oArr2 : o000o00oArr3;
        this.f13766OooOo0O = i;
        this.f13767OooOo0o = i2;
        this.f13765OooOo = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f13769OooOoO0 = "com.google.android.gms";
        } else {
            this.f13769OooOoO0 = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = OooO0O0.f13733OooOo0o;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface o0000oo02 = iInterfaceQueryLocalInterface instanceof OooOo00 ? (OooOo00) iInterfaceQueryLocalInterface : new o0000OO0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                if (o0000oo02 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            o0000OO0 o0000oo03 = (o0000OO0) o0000oo02;
                            Parcel parcelOooO = o0000oo03.OooO(o0000oo03.o000OO0O(), 2);
                            Account account3 = (Account) OoooO0.OooOO0.OooO00o(parcelOooO, Account.CREATOR);
                            parcelOooO.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f13771OooOoo = account2;
        } else {
            this.f13768OooOoO = iBinder;
            this.f13771OooOoo = account;
        }
        this.f13770OooOoOO = scopeArr2;
        this.f13772OooOoo0 = bundle2;
        this.f13773OooOooO = o000o00oArr4;
        this.f13774OooOooo = o000o00oArr3;
        this.f13775Oooo000 = z;
        this.f13776Oooo00O = i4;
        this.f13777Oooo00o = z2;
        this.zzp = str2;
    }

    public final String OooO0o0() {
        return this.zzp;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OooOoo0.o000OOo.OooO00o(this, parcel, i);
    }
}
