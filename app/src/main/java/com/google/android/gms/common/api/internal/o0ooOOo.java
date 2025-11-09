package com.google.android.gms.common.api.internal;

import OooOooo.o000Oo0;
import Oooo00O.o000000O;
import OoooOoO.oOO0O0O0;
import OoooOoo.oOO0O0O;
import OoooOoo.oOO0OO;
import OoooOoo.oOO0Oo00;
import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class o0ooOOo extends OoooO0.OooO implements Oooo000.OooOO0O, Oooo000.OooOOO0 {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final Oooo.OooOo f16752OooOooO = oOO0O0O0.f14942OooO00o;

    /* renamed from: OooOo, reason: collision with root package name */
    public final OoooO0.OooOO0O f16753OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Context f16754OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Set f16755OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Oooo.OooOo f16756OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final o000OO.o0OoOo0 f16757OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public o0OoOo0 f16758OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public oOO0O0O f16759OooOoo0;

    public o0ooOOo(Context context, OoooO0.OooOO0O oooOO0O, o000OO.o0OoOo0 o0oooo0) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f16754OooOo0o = context;
        this.f16753OooOo = oooOO0O;
        this.f16757OooOoOO = o0oooo0;
        this.f16755OooOoO = (Set) o0oooo0.f30188OooOoO0;
        this.f16756OooOoO0 = f16752OooOooO;
    }

    @Override // Oooo000.OooOOO0
    public final void OooO(o000Oo0 o000oo02) {
        this.f16758OooOoo.OooO0O0(o000oo02);
    }

    @Override // Oooo000.OooOO0O
    public final void OooOOO(int i) {
        o0OoOo0 o0oooo0 = this.f16758OooOoo;
        Oooo0 oooo0 = (Oooo0) ((OooO0o) o0oooo0.f16751OooOoOO).f16707OooOooo.get((OooO00o) o0oooo0.f16746OooOo);
        if (oooo0 != null) {
            if (oooo0.f16721OooOooO) {
                oooo0.OooOOOO(new o000Oo0(17));
            } else {
                oooo0.OooOOO(i);
            }
        }
    }

    @Override // Oooo000.OooOO0O
    public final void onConnected() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountOooO0o0;
        boolean z = false;
        oOO0O0O ooo0o0o = this.f16759OooOoo0;
        ooo0o0o.getClass();
        try {
            ooo0o0o.f14944Ooooo00.getClass();
            Account account = new Account(Oooo00O.OooOO0O.DEFAULT_ACCOUNT, "com.google");
            if (Oooo00O.OooOO0O.DEFAULT_ACCOUNT.equals(account.name)) {
                Context context = ooo0o0o.getContext();
                ReentrantLock reentrantLock = OooOoo.o0OoOo0.f13652OooO0OO;
                o000000O.OooO0oo(context);
                ReentrantLock reentrantLock2 = OooOoo.o0OoOo0.f13652OooO0OO;
                reentrantLock2.lock();
                try {
                    if (OooOoo.o0OoOo0.f13653OooO0Oo == null) {
                        OooOoo.o0OoOo0.f13653OooO0Oo = new OooOoo.o0OoOo0(context.getApplicationContext());
                    }
                    OooOoo.o0OoOo0 o0oooo0 = OooOoo.o0OoOo0.f13653OooO0Oo;
                    reentrantLock2.unlock();
                    String strOooO00o = o0oooo0.OooO00o("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strOooO00o)) {
                        String strOooO00o2 = o0oooo0.OooO00o("googleSignInAccount:" + strOooO00o);
                        if (strOooO00o2 != null) {
                            try {
                                googleSignInAccountOooO0o0 = GoogleSignInAccount.OooO0o0(strOooO00o2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountOooO0o0 = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountOooO0o0 = null;
            }
            Integer num = ooo0o0o.f14946OooooO0;
            o000000O.OooO0oo(num);
            Oooo00O.oo000o oo000oVar = new Oooo00O.oo000o(2, account, num.intValue(), googleSignInAccountOooO0o0);
            oOO0OO ooo0oo = (oOO0OO) ooo0o0o.getService();
            ooo0oo.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(ooo0oo.f13892OooOo);
            int i = OoooO00.OooOOO0.f13898OooO00o;
            parcelObtain.writeInt(1);
            int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcelObtain, 20293);
            o00Oo0oo.o00oO0o.OooOooo(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            o00Oo0oo.o00oO0o.OooOo00(parcelObtain, 2, oo000oVar, 0);
            o00Oo0oo.o00oO0o.OooOoo(parcelObtain, iOooOoO);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                ooo0oo.f13894OooOo0o.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f16753OooOo.post(new o00000oO.OooOOO0(this, z, new oOO0Oo00(1, new o000Oo0(8, null), null), 21));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
