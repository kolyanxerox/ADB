package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s20 implements zzg, tc0 {

    /* renamed from: OooOo */
    public Object f23975OooOo;

    /* renamed from: OooOo0O */
    public Object f23976OooOo0O;

    /* renamed from: OooOo0o */
    public Object f23977OooOo0o;

    /* renamed from: OooOoO */
    public Object f23978OooOoO;

    /* renamed from: OooOoO0 */
    public Object f23979OooOoO0;

    /* renamed from: OooOoOO */
    public Object f23980OooOoOO;

    public /* synthetic */ s20() {
        this.f23978OooOoO = null;
        this.f23980OooOoOO = null;
        this.f23976OooOo0O = null;
        this.f23977OooOo0o = null;
        this.f23975OooOo = null;
        this.f23979OooOoO0 = pr0.f23413OooO0o0;
    }

    public static /* bridge */ /* synthetic */ String OooO0O0(s20 s20Var) throws JSONException {
        String str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) s20Var.f23976OooOo0O);
            jSONObject.put("eventCategory", (String) s20Var.f23977OooOo0o);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, (String) s20Var.f23975OooOo);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, (Integer) s20Var.f23978OooOoO);
            jSONObject.putOpt("rewardType", (String) s20Var.f23979OooOoO0);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, (Integer) s20Var.f23980OooOoOO);
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }

    public static h91 OooOOO(b61 b61Var, rm0 rm0Var, h91 h91Var, C1528ee c1528ee) {
        int iOooO00o;
        AbstractC1787lf abstractC1787lfO00000Oo = b61Var.o00000Oo();
        b61Var.f17421OooOoO0.OooO00o();
        w41 w41Var = b61Var.f17420OooOo;
        w41Var.OooOo00();
        if (w41Var.f25227ooOO.f23756OooO00o.OooOOOO()) {
            iOooO00o = 0;
        } else {
            r51 r51Var = w41Var.f25227ooOO;
            iOooO00o = r51Var.f23756OooO00o.OooO00o(r51Var.f23757OooO0O0.f19657OooO00o);
        }
        Object objOooO0o = abstractC1787lfO00000Oo.OooOOOO() ? null : abstractC1787lfO00000Oo.OooO0o(iOooO00o);
        if (!b61Var.o000OO() && !abstractC1787lfO00000Oo.OooOOOO()) {
            C1528ee c1528eeOooO0Oo = abstractC1787lfO00000Oo.OooO0Oo(iOooO00o, c1528ee, false);
            b61Var.o0000oo();
            int i = i80.f19994OooO00o;
            c1528eeOooO0Oo.getClass();
        }
        for (int i2 = 0; i2 < rm0Var.size(); i2++) {
            h91 h91Var2 = (h91) rm0Var.get(i2);
            if (OooOOo0(h91Var2, objOooO0o, b61Var.o000OO(), b61Var.o00000oo(), b61Var.o0000())) {
                return h91Var2;
            }
        }
        if (rm0Var.isEmpty() && h91Var != null && OooOOo0(h91Var, objOooO0o, b61Var.o000OO(), b61Var.o00000oo(), b61Var.o0000())) {
            return h91Var;
        }
        return null;
    }

    public static boolean OooOOo0(h91 h91Var, Object obj, boolean z, int i, int i2) {
        if (!h91Var.f19657OooO00o.equals(obj)) {
            return false;
        }
        int i3 = h91Var.f19658OooO0O0;
        return z ? i3 == i && h91Var.f19659OooO0OO == i2 : i3 == -1 && h91Var.f19661OooO0o0 == -1;
    }

    public void OooO(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f23977OooOo0o = Integer.valueOf(i);
    }

    public df0 OooO00o() {
        gf0 gf0Var = (gf0) this.f23980OooOoOO;
        Object obj = this.f23976OooOo0O;
        String str = (String) this.f23977OooOo0o;
        if (str == null) {
            gf0Var.getClass();
            str = ((ef0) obj).f18605OooOo0O;
        }
        df0 df0Var = new df0(obj, str, (o00000oO.OooOOO) this.f23978OooOoO);
        gf0Var.f19334OooO0OO.o0000Ooo(new sj0(df0Var, 28));
        c60 c60Var = new c60(7, this, df0Var);
        C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
        ((o00000oO.OooOOO) this.f23975OooOo).addListener(c60Var, c2163vl);
        df0Var.addListener(new wp0(0, df0Var, new C1548ey(this, false, df0Var, 21)), c2163vl);
        return df0Var;
    }

    public void OooO0OO(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f23978OooOoO = Integer.valueOf(i);
    }

    public boolean OooO0Oo(zzm zzmVar, String str, ze0 ze0Var, h90 h90Var) {
        mf0 mf0Var;
        zzv.zzq();
        Context context = (Context) this.f23975OooOo;
        boolean zZzI = zzs.zzI(context);
        C2130up c2130up = (C2130up) this.f23977OooOo0o;
        if (zZzI && zzmVar.zzs == null) {
            zzo.zzg("Failed to load the ad because app ID is missing.");
            final int i = 0;
            c2130up.OooO00o().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.j90

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ s20 f20226OooOo0o;

                {
                    this.f20226OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            de0 de0Var = (de0) this.f20226OooOo0o.f23979OooOoO0;
                            ((g90) de0Var.f18243OooOoO0).o0OOO0o(af0.Oooo0O0(4, null, null));
                            break;
                        default:
                            de0 de0Var2 = (de0) this.f20226OooOo0o.f23979OooOoO0;
                            ((g90) de0Var2.f18243OooOoO0).o0OOO0o(af0.Oooo0O0(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            final int i2 = 1;
            c2130up.OooO00o().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.j90

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ s20 f20226OooOo0o;

                {
                    this.f20226OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            de0 de0Var = (de0) this.f20226OooOo0o.f23979OooOoO0;
                            ((g90) de0Var.f18243OooOoO0).o0OOO0o(af0.Oooo0O0(4, null, null));
                            break;
                        default:
                            de0 de0Var2 = (de0) this.f20226OooOo0o.f23979OooOoO0;
                            ((g90) de0Var2.f18243OooOoO0).o0OOO0o(af0.Oooo0O0(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        ze0.OooO(context, zzmVar.zzf);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue() && zzmVar.zzf) {
            ((p30) c2130up.f24694OooOo0O.zzb()).OooO0o0(true);
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleOooO0oO = af0.OooO0oO(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        ud0 ud0Var = (ud0) this.f23976OooOo0O;
        ud0Var.f24625OooO00o = zzmVar;
        ud0Var.f24642OooOo00 = bundleOooO0oO;
        ud0Var.f24636OooOOO0 = ((i90) ze0Var).f20005OooO0oO;
        vd0 vd0VarOooO00o = ud0Var.OooO00o();
        jf0 jf0VarOooOoO0 = ze0.OooOoO0(context, af0.OoooOoO(vd0VarOooO00o), 8, zzmVar);
        de0 de0Var = (de0) this.f23979OooOoO0;
        c90 c90Var = (c90) de0Var.f18240OooOo;
        zzcm zzcmVar = vd0VarOooO00o.f24961OooOOO;
        if (zzcmVar != null) {
            c90Var.OooOO0(zzcmVar);
        }
        C2130up c2130up2 = c2130up.f24676OooO0O0;
        C1765ku c1765ku = new C1765ku();
        c1765ku.f20683OooO0O0 = context;
        c1765ku.f20684OooO0OO = vd0VarOooO00o;
        C1802lu c1802lu = new C1802lu(c1765ku);
        C1767kw c1767kw = new C1767kw();
        c1767kw.OooO0OO(c90Var, c2130up.OooO00o());
        C1804lw c1804lw = new C1804lw(c1767kw);
        C2093tp c2093tp = new C2093tp(c2130up2, new wj0(null, 13), new C2249xx(0, (C2213wy) de0Var.f18242OooOo0o, c90Var.OooO0o()), new C1658hx(4, (byte) 0), c1804lw, c1802lu, new sj0(23, false), null, null);
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            mf0Var = (mf0) c2093tp.f24377OooO0o0.zzb();
            mf0Var.OooO(8);
            mf0Var.OooO0O0(zzmVar.zzp);
            mf0Var.OooO0o(zzmVar.zzm);
        } else {
            mf0Var = null;
        }
        ((fe0) c2130up.f24708Oooo0O0.zzb()).OooO0O0(1);
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c2130up.f24678OooO0Oo.zzb();
        C1875nt c1875nt = (C1875nt) c2093tp.f24450o00O0O.zzb();
        df0 df0VarOooO00o = c1875nt.OooO00o(c1875nt.OooO0O0());
        C1727jt c1727jt = new C1727jt(c2163vl, scheduledExecutorService, df0VarOooO00o);
        this.f23980OooOoOO = c1727jt;
        df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new C1654ht(c1727jt, new OooOOo0.o0OOO0o(this, (C1847n1) h90Var, mf0Var, jf0VarOooOoO0, c2093tp, 5, false), 0)), c2163vl);
        return true;
    }

    public void OooO0o(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f23976OooOo0O = Integer.valueOf(i);
    }

    public void OooO0o0(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f23980OooOoOO = Integer.valueOf(i);
    }

    public s20 OooO0oO(bf0 bf0Var) {
        return OooOO0(new C2043sc(bf0Var, 16));
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public o00000oO.OooOOO OooO0oo(C1548ey c1548ey, sc0 sc0Var) {
        synchronized (this) {
            C2204wp c2204wpOooo0oO = sc0Var.Oooo0oO((rc0) c1548ey.f18706OooOo);
            lc0 lc0Var = new lc0((String) this.f23977OooOo0o);
            switch (c2204wpOooo0oO.f25352OooO00o) {
                case 0:
                    c2204wpOooo0oO.f25355OooO0Oo = lc0Var;
                    break;
                default:
                    c2204wpOooo0oO.f25355OooO0Oo = lc0Var;
                    break;
            }
            InterfaceC1691iu interfaceC1691iu = (InterfaceC1691iu) c2204wpOooo0oO.OooO0OO();
            interfaceC1691iu.zzg();
            interfaceC1691iu.zzg();
            zzm zzmVar = interfaceC1691iu.zzg().f24954OooO0Oo;
            if (zzmVar.zzs != null || zzmVar.zzx != null) {
                this.f23978OooOoO = interfaceC1691iu;
                return ((C1548ey) this.f23976OooOo0O).OooO0o0(c1548ey, sc0Var, interfaceC1691iu);
            }
            vd0 vd0VarZzg = interfaceC1691iu.zzg();
            return ii0.ooOO(tp0.OooOOo(((de0) this.f23975OooOo).OooOO0O(c1548ey, sc0Var, interfaceC1691iu)), new b70(this, c1548ey, new kc0(sc0Var, c1548ey, vd0VarZzg.f24954OooO0Oo, vd0VarZzg.f24955OooO0o, (cq0) this.f23980OooOoOO, vd0VarZzg.f24959OooOO0, null), sc0Var, interfaceC1691iu, 1), (cq0) this.f23980OooOoOO);
        }
    }

    public s20 OooOO0(lp0 lp0Var) {
        dp0 dp0VarOoOO = ii0.ooOO((o00000oO.OooOOO) this.f23978OooOoO, lp0Var, ((gf0) this.f23980OooOoOO).f19332OooO00o);
        return new s20((gf0) this.f23980OooOoOO, this.f23976OooOo0O, (String) this.f23977OooOo0o, (o00000oO.OooOOO) this.f23975OooOo, (List) this.f23979OooOoO0, dp0VarOoOO);
    }

    public qr0 OooOO0O() throws GeneralSecurityException {
        if (((Integer) this.f23978OooOoO) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f23980OooOoOO) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f23976OooOo0O) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f23977OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((or0) this.f23975OooOo) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        or0 or0Var = (or0) this.f23975OooOo;
        if (or0Var == or0.f23086OooOo) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (or0Var == or0.f23088OooOoO0) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (or0Var == or0.f23087OooOoO) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (or0Var == or0.f23089OooOoOO) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (or0Var != or0.f23091OooOoo0) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new qr0(((Integer) this.f23978OooOoO).intValue(), ((Integer) this.f23980OooOoOO).intValue(), ((Integer) this.f23976OooOo0O).intValue(), ((Integer) this.f23977OooOo0o).intValue(), (pr0) this.f23979OooOoO0, (or0) this.f23975OooOo);
    }

    public o00000oO.OooOOO OooOO0o(oe0 oe0Var, C1548ey c1548ey) {
        InterfaceC1691iu interfaceC1691iu = oe0Var.f22979OooO00o;
        this.f23978OooOoO = interfaceC1691iu;
        if (oe0Var.f22981OooO0OO == null) {
            interfaceC1691iu.zzb().f21592OooO0oO = oe0Var.f22980OooO0O0;
            return ((C1548ey) this.f23976OooOo0O).OooO0o0(c1548ey, null, oe0Var.f22979OooO00o);
        }
        if (interfaceC1691iu.zzf() != null) {
            ec0 ec0Var = oe0Var.f22981OooO0OO.f17104OooO0o0;
            qc0 qc0VarZzf = oe0Var.f22979OooO00o.zzf();
            ec0Var.getClass();
            ec0Var.f18567OooOoo = (ec0) qc0VarZzf;
        }
        return ii0.OooooOO(oe0Var.f22981OooO0OO);
    }

    public s20 OooOOO0(long j) {
        o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0((o00000oO.OooOOO) this.f23978OooOoO, j, TimeUnit.SECONDS, ((gf0) this.f23980OooOoOO).f19333OooO0O0);
        return new s20((gf0) this.f23980OooOoOO, this.f23976OooOo0O, (String) this.f23977OooOo0o, (o00000oO.OooOOO) this.f23975OooOo, (List) this.f23979OooOoO0, oooOOOO00Oo0);
    }

    public void OooOOOO(oOo0o00 ooo0o00, h91 h91Var, AbstractC1787lf abstractC1787lf) {
        if (h91Var == null) {
            return;
        }
        if (abstractC1787lf.OooO00o(h91Var.f19657OooO00o) != -1) {
            ooo0o00.OooO0o0(h91Var, abstractC1787lf);
            return;
        }
        AbstractC1787lf abstractC1787lf2 = (AbstractC1787lf) ((mn0) this.f23975OooOo).get(h91Var);
        if (abstractC1787lf2 != null) {
            ooo0o00.OooO0o0(h91Var, abstractC1787lf2);
        }
    }

    public void OooOOOo(AbstractC1787lf abstractC1787lf) {
        oOo0o00 ooo0o00 = new oOo0o00(4);
        if (((rm0) this.f23977OooOo0o).isEmpty()) {
            OooOOOO(ooo0o00, (h91) this.f23978OooOoO, abstractC1787lf);
            if (!ii0.OooOOoo((h91) this.f23980OooOoOO, (h91) this.f23978OooOoO)) {
                OooOOOO(ooo0o00, (h91) this.f23980OooOoOO, abstractC1787lf);
            }
            if (!ii0.OooOOoo((h91) this.f23979OooOoO0, (h91) this.f23978OooOoO) && !ii0.OooOOoo((h91) this.f23979OooOoO0, (h91) this.f23980OooOoOO)) {
                OooOOOO(ooo0o00, (h91) this.f23979OooOoO0, abstractC1787lf);
            }
        } else {
            for (int i = 0; i < ((rm0) this.f23977OooOo0o).size(); i++) {
                OooOOOO(ooo0o00, (h91) ((rm0) this.f23977OooOo0o).get(i), abstractC1787lf);
            }
            if (!((rm0) this.f23977OooOo0o).contains((h91) this.f23979OooOoO0)) {
                OooOOOO(ooo0o00, (h91) this.f23979OooOoO0, abstractC1787lf);
            }
        }
        this.f23975OooOo = ooo0o00.OooOO0o();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zza(View view) {
        if (((AtomicBoolean) this.f23980OooOoOO).compareAndSet(false, true)) {
            ((C1947pr) this.f23978OooOoO).zzr();
            ((C2285yw) this.f23979OooOoO0).o00000oo(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        if (((AtomicBoolean) this.f23980OooOoOO).get()) {
            ((C1950pu) this.f23976OooOo0O).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        if (((AtomicBoolean) this.f23980OooOoOO).get()) {
            ((C2320zu) this.f23977OooOo0o).zza();
            ((C1438bx) this.f23975OooOo).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public Object zzd() {
        InterfaceC1691iu interfaceC1691iu;
        synchronized (this) {
            interfaceC1691iu = (InterfaceC1691iu) this.f23978OooOoO;
        }
        return interfaceC1691iu;
    }

    public s20(C1548ey c1548ey, de0 de0Var, ab1 ab1Var, String str, cq0 cq0Var) {
        this.f23976OooOo0O = c1548ey;
        this.f23975OooOo = de0Var;
        this.f23979OooOoO0 = ab1Var;
        this.f23977OooOo0o = str;
        this.f23980OooOoOO = cq0Var;
    }

    public s20(gf0 gf0Var, Object obj, String str, o00000oO.OooOOO oooOOO, List list, o00000oO.OooOOO oooOOO2) {
        this.f23980OooOoOO = gf0Var;
        this.f23976OooOo0O = obj;
        this.f23977OooOo0o = str;
        this.f23975OooOo = oooOOO;
        this.f23979OooOoO0 = list;
        this.f23978OooOoO = oooOOO2;
    }

    public /* synthetic */ s20(String str) {
        this.f23977OooOo0o = str;
    }
}
