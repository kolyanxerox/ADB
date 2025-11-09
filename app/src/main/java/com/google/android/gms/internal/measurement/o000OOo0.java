package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000OOo0 extends o00O000o {

    /* renamed from: OooOoO */
    public final /* synthetic */ int f26504OooOoO = 0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ Object f26505OooOoOO;

    /* renamed from: OooOoo */
    public final /* synthetic */ Object f26506OooOoo;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ Object f26507OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(oOO00O ooo00o, Activity activity, o00000O o00000o) {
        super(ooo00o.f26848OooOo0O, true);
        this.f26507OooOoo0 = activity;
        this.f26506OooOoo = o00000o;
        this.f26505OooOoOO = ooo00o;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f26504OooOoO) {
            case 0:
                try {
                    Context context = (Context) this.f26507OooOoo0;
                    Oooo00O.o000000O.OooO0oo(context);
                    String strOooO00o = OoooOOO.oO0000O.OooO00o(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strOooO00o)) {
                        strOooO00o = OoooOOO.oO0000O.OooO00o(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strOooO00o);
                    o0000 o0000VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                    o00O00OO o00o00oo = (o00O00OO) this.f26505OooOoOO;
                    boolean z = boolValueOf == null || !boolValueOf.booleanValue();
                    o00o00oo.getClass();
                    try {
                        o0000VarAsInterface = o0000Ooo.asInterface(Oooo0oO.o000000.OooO0OO(context, z ? Oooo0oO.o000000.f13869OooO0Oo : Oooo0oO.o000000.f13868OooO0OO, ModuleDescriptor.MODULE_ID).OooO0O0("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (Oooo0oO.o0OO00O e) {
                        o00o00oo.OooO0Oo(e, true, false);
                    }
                    o00o00oo.f26531OooO0oO = o0000VarAsInterface;
                    if (o00o00oo.f26531OooO0oO != null) {
                        int iOooO00o = Oooo0oO.o000000.OooO00o(context, ModuleDescriptor.MODULE_ID);
                        o000O0o o000o0o2 = new o000O0o(133005L, Math.max(iOooO00o, r6), Boolean.TRUE.equals(boolValueOf) || Oooo0oO.o000000.OooO0Oo(context, ModuleDescriptor.MODULE_ID, false) < iOooO00o, (Bundle) this.f26506OooOoo, OoooOOO.oO0000O.OooO00o(context));
                        o0000 o0000Var = o00o00oo.f26531OooO0oO;
                        Oooo00O.o000000O.OooO0oo(o0000Var);
                        o0000Var.initialize(new Oooo0o.OooO0OO(context), o000o0o2, this.f26518OooOo0O);
                        break;
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                        break;
                    }
                } catch (Exception e2) {
                    ((o00O00OO) this.f26505OooOoOO).OooO0Oo(e2, true, false);
                    return;
                }
                break;
            case 1:
                o0000 o0000Var2 = ((o00O00OO) this.f26505OooOoOO).f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.logHealthData(5, (String) this.f26507OooOoo0, new Oooo0o.OooO0OO((Exception) this.f26506OooOoo), new Oooo0o.OooO0OO(null), new Oooo0o.OooO0OO(null));
                break;
            case 2:
                o0000 o0000Var3 = ((o00O00OO) this.f26505OooOoOO).f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.performAction((Bundle) this.f26506OooOoo, (o00000O) this.f26507OooOoo0, this.f26518OooOo0O);
                break;
            case 3:
                o0000 o0000Var4 = ((o00O00OO) this.f26505OooOoOO).f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var4);
                o0000Var4.getMaxUserProperties((String) this.f26507OooOoo0, (o00000O) this.f26506OooOoo);
                break;
            case 4:
                Bundle bundle2 = (Bundle) this.f26506OooOoo;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                o0000 o0000Var5 = ((oOO00O) this.f26505OooOoOO).f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var5);
                o0000Var5.onActivityCreatedByScionActivityInfo(o000O00.OooO0o0((Activity) this.f26507OooOoo0), bundle, this.f26519OooOo0o);
                break;
            default:
                o0000 o0000Var6 = ((oOO00O) this.f26505OooOoOO).f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var6);
                o0000Var6.onActivitySaveInstanceStateByScionActivityInfo(o000O00.OooO0o0((Activity) this.f26507OooOoo0), (o00000O) this.f26506OooOoo, this.f26519OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public void OooO0O0() {
        switch (this.f26504OooOoO) {
            case 2:
                ((o00000O) this.f26507OooOoo0).o0000oO0(null);
                break;
            case 3:
                ((o00000O) this.f26506OooOoo).o0000oO0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(oOO00O ooo00o, Bundle bundle, Activity activity) {
        super(ooo00o.f26848OooOo0O, true);
        this.f26506OooOoo = bundle;
        this.f26507OooOoo0 = activity;
        this.f26505OooOoOO = ooo00o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o00O00OO o00o00oo, Context context, Bundle bundle) {
        super(o00o00oo, true);
        this.f26507OooOoo0 = context;
        this.f26506OooOoo = bundle;
        Objects.requireNonNull(o00o00oo);
        this.f26505OooOoOO = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o00O00OO o00o00oo, Bundle bundle, o00000O o00000o) {
        super(o00o00oo, true);
        this.f26506OooOoo = bundle;
        this.f26507OooOoo0 = o00000o;
        Objects.requireNonNull(o00o00oo);
        this.f26505OooOoOO = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o00O00OO o00o00oo, String str, o00000O o00000o) {
        super(o00o00oo, true);
        this.f26507OooOoo0 = str;
        this.f26506OooOoo = o00000o;
        Objects.requireNonNull(o00o00oo);
        this.f26505OooOoOO = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o00O00OO o00o00oo, String str, Exception exc) {
        super(o00o00oo, false);
        this.f26507OooOoo0 = str;
        this.f26506OooOoo = exc;
        Objects.requireNonNull(o00o00oo);
        this.f26505OooOoOO = o00o00oo;
    }
}
