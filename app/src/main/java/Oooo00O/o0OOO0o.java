package Oooo00O;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* loaded from: classes2.dex */
public final class o0OOO0o extends Oooo0o.OooO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OOO0o f13828OooO0OO = new o0OOO0o("com.google.android.gms.common.ui.SignInButtonCreatorImpl");

    public static View OooOO0o(Context context, int i, int i2) throws Oooo0o.OooO0o {
        o0OOO0o o0ooo0o = f13828OooO0OO;
        try {
            o0ooOOo o0ooooo = new o0ooOOo(1, i, i2, null);
            return (View) Oooo0o.OooO0OO.o000O0oO(((o00Ooo) o0ooo0o.OooO0Oo(context)).o0OoO0o(new Oooo0o.OooO0OO(context), o0ooooo));
        } catch (Exception e) {
            throw new Oooo0o.OooO0o(OooO0oO.OooOo.OooO0o0(i, i2, "Could not get button with size ", " and color "), e);
        }
    }

    @Override // Oooo0o.OooO
    public final Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof o00Ooo ? (o00Ooo) iInterfaceQueryLocalInterface : new o00Ooo(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator", 1);
    }
}
