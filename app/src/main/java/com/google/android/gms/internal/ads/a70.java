package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a70 implements p60 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f16930OooO00o = 1;

    /* renamed from: OooO0O0 */
    public final Context f16931OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f16932OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f16933OooO0Oo;

    /* renamed from: OooO0o0 */
    public Object f16934OooO0o0;

    public a70(Context context, VersionInfoParcel versionInfoParcel, AbstractC1990qx abstractC1990qx, cq0 cq0Var) {
        this.f16931OooO0O0 = context;
        this.f16933OooO0Oo = versionInfoParcel;
        this.f16932OooO0OO = abstractC1990qx;
        this.f16934OooO0o0 = cq0Var;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final Object OooO00o(rd0 rd0Var, kd0 kd0Var, l60 l60Var) throws z70, yd0 {
        View view;
        Object obj = this.f16932OooO0OO;
        switch (this.f16930OooO00o) {
            case 0:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue() && kd0Var.f20542Oooooo0) {
                    try {
                        view = (View) Oooo0o.OooO0OO.o000O0oO(((InterfaceC1456cf) this.f16934OooO0o0).zze());
                        boolean zZzf = ((InterfaceC1456cf) this.f16934OooO0o0).zzf();
                        if (view == null) {
                            throw new yd0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (zZzf) {
                            try {
                                view = (View) ii0.ooOO(yp0.f25991OooOo0o, new C1617gt(this, view, kd0Var, 5), AbstractC2200wl.f25325OooO0o).get();
                            } catch (InterruptedException | ExecutionException e) {
                                throw new yd0(e);
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new yd0(e2);
                    }
                } else {
                    view = (View) this.f16933OooO0Oo;
                }
                de0 de0Var = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                C1386ai c1386ai = new C1386ai(view, (InterfaceC1722jo) null, new C1847n1(l60Var, 23), (ld0) kd0Var.OooOo0.get(0));
                C2315zp c2315zp = (C2315zp) ((AbstractC1837ms) obj);
                C2278yp c2278yp = new C2278yp(c2315zp.f26241OooO0Oo, c2315zp.f26243OooO0o0, de0Var, c1386ai);
                ((C2285yw) c2278yp.f25987OoooO0.zzb()).o00000oo(view);
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new k80((C1950pu) c2278yp.f25974OooOooO.zzb(), (C2322zw) c2278yp.f25981Oooo0O0.zzb(), (C2320zu) c2278yp.f25979Oooo00O.zzb(), (C1508dv) c2278yp.f25973OooOoo0.zzb(), c2278yp.o00o0O(), (C1473cw) c2278yp.f25959OooOOO0.f26326o0000oO0.zzb(), (C1877nv) c2278yp.f25983Oooo0o.zzb(), (C1694ix) c2278yp.f25985Oooo0oO.zzb(), (C1400aw) c2278yp.f25986Oooo0oo.zzb(), (C2246xu) c2278yp.f25976Oooo.zzb()));
                return c2278yp.o00Ooo();
            case 1:
                C1431bq c1431bqOooO00o = ((AbstractC1990qx) obj).OooO00o(new de0(rd0Var, kd0Var, l60Var.f20808OooO00o), new C2249xx(29, new C1548ey(14, this, l60Var), (Object) null));
                ((C1472cv) c1431bqOooO00o.f17555OooOOoo.zzb()).o00000o0(new C2316zq((ee0) l60Var.f20809OooO0O0, 0), (cq0) this.f16934OooO0o0);
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new m80((C1950pu) c1431bqOooO00o.f17571Oooo00o.zzb(), (C2322zw) c1431bqOooO00o.f17573Oooo0OO.zzb(), (C2320zu) c1431bqOooO00o.f17565OooOooO.zzb(), (C1508dv) c1431bqOooO00o.f17570Oooo00O.zzb(), (C1619gv) c1431bqOooO00o.f17575Oooo0o0.zzb(), (C1473cw) c1431bqOooO00o.f17550OooOOO0.f18362o0000o0.zzb(), (C1877nv) c1431bqOooO00o.f17576Oooo0oO.zzb(), (C1694ix) c1431bqOooO00o.f17577Oooo0oo.zzb(), (C1400aw) c1431bqOooO00o.f17567Oooo.zzb(), (C2246xu) c1431bqOooO00o.f17579OoooO0.zzb()));
                return c1431bqOooO00o.o00o0O();
            default:
                if (!((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24957OooO0oO.contains(Integer.toString(6))) {
                    throw new z70(2, "Unified must be used for RTB.");
                }
                C2065sy c2065syOooOOO = C2065sy.OooOOO((InterfaceC1640hf) this.f16933OooO0Oo);
                vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                if (!vd0Var.f24957OooO0oO.contains(Integer.toString(c2065syOooOOO.OooO0oO()))) {
                    throw new z70(1, "No corresponding native ad listener");
                }
                de0 de0Var2 = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                wj0 wj0Var = new wj0(c2065syOooOOO, 19);
                C1992qz c1992qz = new C1992qz(null, null, (InterfaceC1640hf) this.f16933OooO0Oo);
                C2093tp c2093tp = (C2093tp) ((AbstractC2323zx) obj);
                C2093tp c2093tp2 = c2093tp.f24374OooO0OO;
                C1764kt c1764kt = new C1764kt(de0Var2, 0);
                p31 p31Var = c2093tp2.f24391OooOo0O;
                C2130up c2130up = c2093tp.f24373OooO0O0;
                C1591g3 c1591g3 = c2130up.f24742o000OOo;
                p31 p31VarOooO0O0 = p31.OooO0O0(new C1507du(p31Var, c1764kt, 0));
                p31 p31VarOooO0O02 = p31.OooO0O0(new C1986qt(p31VarOooO0O0, 12));
                int i = x31.f25505OooO0OO;
                ArrayList arrayList = new ArrayList(1);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(c2093tp2.f24451o00Oo0);
                arrayList2.add(c2093tp2.f24452o00Ooo);
                arrayList.add(p31VarOooO0O02);
                p31 p31VarOooO0O03 = p31.OooO0O0(new C1987qu(new x31(arrayList, arrayList2), 3));
                p31 p31VarOooO0O04 = p31.OooO0O0(wz0.f25461OooOoO);
                p31 p31VarOooO0O05 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 9));
                C1764kt c1764kt2 = new C1764kt(de0Var2, 3);
                C1764kt c1764kt3 = new C1764kt(de0Var2, 2);
                C1834mp c1834mp = c2130up.f24681OooO0oO;
                p31 p31VarOooO0O06 = p31.OooO0O0(new C1797lp(c1834mp, 13));
                p31 p31VarOooO0O07 = p31.OooO0O0(wz0.f25467OooOooo);
                C1760kp c1760kp = c2130up.f24715OoooO0;
                p31 p31Var2 = c2130up.f24752o0OOO0o;
                p31 p31Var3 = c2130up.f24678OooO0Oo;
                p31 p31VarOooO0O08 = p31.OooO0O0(new C1504dr(c2130up.f24706Oooo00O, c2130up.f24705Oooo000, c1764kt, c1764kt3, p31.OooO0O0(new C1504dr(c1834mp, c1760kp, p31VarOooO0O06, p31VarOooO0O07, p31Var2, p31Var3)), c2093tp2.f24377OooO0o0));
                C2250xy c2250xy = new C2250xy(1);
                C1591g3 c1591g32 = new C1591g3(29);
                p31 p31Var4 = c2093tp2.f24377OooO0o0;
                p31 p31VarOooO0O09 = p31.OooO0O0(new C1725jr(c1834mp, c2130up.f24677OooO0OO, p31Var3, c1764kt2, c1764kt, c2093tp2.f24429Ooooooo, p31VarOooO0O08, c2250xy, c1591g32, c2130up.f24699OooOoo, c2093tp2.f24461o0OoOo0, p31Var4, c2093tp2.f24455o00oO0o));
                C1986qt c1986qt = new C1986qt(p31VarOooO0O09, 1);
                C1986qt c1986qt2 = new C1986qt(p31.OooO0O0(new C1866nk(c1764kt, c2130up.f24703Oooo, 3)), 18);
                ArrayList arrayList3 = new ArrayList(4);
                ArrayList arrayList4 = new ArrayList(2);
                arrayList3.add(c2093tp2.f24453o00o0O);
                arrayList4.add(c2093tp2.f24456o00ooo);
                arrayList4.add(c2093tp2.f24463oo000o);
                arrayList3.add(p31VarOooO0O05);
                arrayList3.add(c1986qt);
                arrayList3.add(c1986qt2);
                p31 p31VarOooO0O010 = p31.OooO0O0(new C1987qu(new x31(arrayList3, arrayList4), 4));
                C1834mp c1834mp2 = c2130up.f24681OooO0oO;
                C1591g3 c1591g33 = wz0.f25464OooOoo;
                p31 p31VarOooO0O011 = p31.OooO0O0(new b20(c1834mp2, c2130up.o0ooOoO, c2130up.f24692OooOo, c1764kt2, c1764kt, c2130up.f24702OooOooo, c1591g33));
                p31 p31VarOooO0O012 = p31.OooO0O0(new C1986qt(p31VarOooO0O011, 10));
                p31 p31VarOooO0O013 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 8));
                p31 p31VarOooO0O014 = p31.OooO0O0(new C1986qt(p31.OooO0O0(new C2060st(c2130up.f24748o00oO0o, c2093tp2.f24375OooO0Oo, 0)), 8));
                C1986qt c1986qt3 = new C1986qt(p31VarOooO0O09, 0);
                ArrayList arrayList5 = new ArrayList(5);
                ArrayList arrayList6 = new ArrayList(3);
                arrayList5.add(c2093tp2.f24454o00oO0O);
                arrayList5.add(c2093tp2.f24462o0ooOO0);
                arrayList6.add(c2093tp2.o0ooOOo);
                arrayList6.add(c2093tp2.o0ooOoO);
                arrayList5.add(p31VarOooO0O012);
                arrayList5.add(p31VarOooO0O013);
                arrayList6.add(p31VarOooO0O014);
                arrayList5.add(c1986qt3);
                p31 p31VarOooO0O015 = p31.OooO0O0(new C1987qu(new x31(arrayList5, arrayList6), 0));
                p31 p31VarOooO0O016 = p31.OooO0O0(new C1986qt(p31VarOooO0O011, 11));
                p31 p31VarOooO0O017 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 11));
                p31 p31VarOooO0O018 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 14));
                p31 p31VarOooO0O019 = p31.OooO0O0(AbstractC1641hg.f19747Oooo);
                C1916ox c1916ox = new C1916ox(p31VarOooO0O019, 6);
                ArrayList arrayList7 = new ArrayList(2);
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add(c2093tp2.f24457o0O0O00);
                arrayList7.add(p31VarOooO0O018);
                arrayList7.add(c1916ox);
                C1760kp c1760kp2 = new C1760kp(p31.OooO0O0(new C1866nk(new x31(arrayList7, arrayList8), c1764kt, 11)), 19);
                C1986qt c1986qt4 = new C1986qt(p31VarOooO0O09, 3);
                ArrayList arrayList9 = new ArrayList(6);
                ArrayList arrayList10 = new ArrayList(2);
                arrayList9.add(c2093tp2.f24459o0OOO0o);
                arrayList9.add(c2093tp2.f24460o0Oo0oo);
                arrayList10.add(c2093tp2.f24458o0OO00O);
                arrayList10.add(c2093tp2.f24464oo0o0Oo);
                arrayList9.add(p31VarOooO0O016);
                arrayList9.add(p31VarOooO0O017);
                arrayList9.add(c1760kp2);
                arrayList9.add(c1986qt4);
                p31 p31VarOooO0O020 = p31.OooO0O0(new C1987qu(new x31(arrayList9, arrayList10), 2));
                C1986qt c1986qt5 = new C1986qt(p31VarOooO0O09, 5);
                ArrayList arrayList11 = new ArrayList(1);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(c2093tp2.f24449o000OOo);
                arrayList11.add(c1986qt5);
                p31 p31VarOooO0O021 = p31.OooO0O0(new C1987qu(new x31(arrayList11, arrayList12), 18));
                C1760kp c1760kp3 = new C1760kp(p31.OooO0O0(new C1507du(c1764kt, c2130up.f24706Oooo00O)), 29);
                ArrayList arrayList13 = new ArrayList(1);
                new ArrayList(1).add(c2093tp2.f24432o000000);
                arrayList13.add(c1760kp3);
                p31 p31VarOooO0O022 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 15));
                ArrayList arrayList14 = new ArrayList(1);
                ArrayList arrayList15 = new ArrayList(1);
                arrayList15.add(c2093tp2.f24433o000000O);
                arrayList14.add(p31VarOooO0O022);
                p31 p31VarOooO0O023 = p31.OooO0O0(new C1987qu(new x31(arrayList14, arrayList15), 19));
                p31 p31VarOooO0O024 = p31.OooO0O0(new C1986qt(p31VarOooO0O0, 13));
                C1986qt c1986qt6 = new C1986qt(p31VarOooO0O09, 4);
                ArrayList arrayList16 = new ArrayList(6);
                ArrayList arrayList17 = new ArrayList(4);
                arrayList16.add(c2093tp2.f24434o000000o);
                arrayList17.add(c2093tp2.f24431o00000);
                arrayList16.add(c2093tp2.f24436o00000O0);
                arrayList16.add(c2093tp2.f24435o00000O);
                arrayList17.add(c2093tp2.f24437o00000OO);
                arrayList17.add(c2093tp2.f24438o00000Oo);
                arrayList17.add(c2093tp2.f24439o00000o0);
                arrayList16.add(c2093tp2.f24445o0000Ooo);
                arrayList16.add(p31VarOooO0O024);
                arrayList16.add(c1986qt6);
                p31 p31VarOooO0O025 = p31.OooO0O0(new C1987qu(new x31(arrayList16, arrayList17), 5));
                C1986qt c1986qt7 = new C1986qt(p31.OooO0O0(new C1760kp(p31VarOooO0O010, 18)), 7);
                p31 p31VarOooO0O026 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 13));
                ArrayList arrayList18 = new ArrayList(2);
                ArrayList arrayList19 = new ArrayList(1);
                arrayList19.add(c2093tp2.f24441o00000oo);
                arrayList18.add(c1986qt7);
                arrayList18.add(p31VarOooO0O026);
                p31 p31VarOooO0O027 = p31.OooO0O0(new C1987qu(new x31(arrayList18, arrayList19), 9));
                C1651hq c1651hq = new C1651hq(wj0Var, 14);
                C2066sz c2066sz = new C2066sz(new C1732jy(c1651hq, 1), c2130up.f24677OooO0OO);
                ArrayList arrayList20 = new ArrayList(1);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c2093tp2.f24430o0000);
                arrayList20.add(c2066sz);
                p31 p31VarOooO0O028 = p31.OooO0O0(new C1731jx(new x31(arrayList20, arrayList21)));
                p31 p31VarOooO0O029 = p31.OooO0O0(new C1986qt(p31VarOooO0O011, 9));
                ArrayList arrayList22 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList22.add(p31VarOooO0O029);
                p31 p31VarOooO0O030 = p31.OooO0O0(new C1987qu(new x31(arrayList22, list), 12));
                p31 p31VarOooO0O031 = p31.OooO0O0(new C2021rr(p31VarOooO0O04, c2130up.f24677OooO0OO, 10));
                C1986qt c1986qt8 = new C1986qt(p31VarOooO0O09, 2);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(c2093tp2.f24443o0000O00);
                arrayList23.add(p31VarOooO0O031);
                arrayList23.add(c1986qt8);
                C1987qu c1987qu = new C1987qu(new x31(arrayList23, arrayList24), 1);
                p31 p31VarOooO0O032 = p31.OooO0O0(new C1986qt(p31VarOooO0O011, 6));
                ArrayList arrayList25 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList25.add(p31VarOooO0O032);
                p31 p31VarOooO0O033 = p31.OooO0O0(new C1940pk(c1987qu, new x31(arrayList25, list2), c2130up.f24678OooO0Oo, 9));
                C1764kt c1764kt4 = new C1764kt(de0Var2, 1);
                C1984qr c1984qr = new C1984qr(c1764kt, c1764kt4, c2093tp2.f24394OooOoO0, c1764kt3, c2093tp2.f24376OooO0o);
                ArrayList arrayList26 = new ArrayList(1);
                ArrayList arrayList27 = new ArrayList(1);
                arrayList27.add(c2093tp2.f24446o0000oO);
                arrayList26.add(c2093tp2.f24442o0000O0);
                C2171vt c2171vt = new C2171vt(c1764kt2, c1764kt, p31VarOooO0O03, p31VarOooO0O025, c2093tp2.f24447o0000oo, c1984qr, p31VarOooO0O04, new C1987qu(new x31(arrayList26, arrayList27), 6), p31VarOooO0O021);
                C1916ox c1916ox2 = new C1916ox(p31.OooO0O0(new C1542es(new C2029rz(c1992qz, 0), new C2029rz(c1992qz, 1), new C2029rz(c1992qz, 2), p31VarOooO0O020, p31VarOooO0O015, p31VarOooO0O023, c2093tp2.f24391OooOo0O, c1764kt, c2130up.f24683OooOO0, c2093tp2.f24375OooO0Oo)), 8);
                p31 p31VarOooO0O034 = p31.OooO0O0(new C2095tr(c1764kt, 1));
                C2250xy c2250xy2 = new C2250xy(2);
                C2250xy c2250xy3 = new C2250xy(3);
                p31 p31VarOooO0O035 = p31.OooO0O0(new C1651hq(new C1732jy(c1651hq, 0), 13));
                C1876nu c1876nu = c2093tp2.f24375OooO0Oo;
                C1760kp c1760kp4 = c2130up.f24715OoooO0;
                p31 p31Var5 = c2130up.f24677OooO0OO;
                C1476cz c1476cz = new C1476cz(c1760kp4, c1876nu, p31VarOooO0O034, c1651hq, c2250xy2, c2250xy3, p31Var5, p31VarOooO0O035);
                w90 w90Var = new w90();
                p31 p31VarOooO0O036 = p31.OooO0O0(new n00(c1764kt4, w90Var, c1651hq, 1));
                p31 p31VarOooO0O037 = p31.OooO0O0(new n00(c1764kt4, w90Var, c1651hq, 0));
                p31 p31VarOooO0O038 = p31.OooO0O0(new C2280yr((q31) c1764kt4, (q31) w90Var, (q31) c1651hq, c2130up.f24692OooOo, 8));
                p31 p31VarOooO0O039 = p31.OooO0O0(new C1866nk(w90Var, c1651hq, 16));
                C1834mp c1834mp3 = c2130up.f24681OooO0oO;
                w90.OooO00o(w90Var, p31.OooO0O0(new C1954py(c2171vt, p31Var5, c1651hq, c1916ox2, c1476cz, p31VarOooO0O034, c2093tp2.f24410Oooo0oo, p31VarOooO0O036, p31VarOooO0O037, p31VarOooO0O038, p31VarOooO0O039, p31.OooO0O0(new C2280yr(c1834mp3, c1651hq, c1476cz, w90Var, 7)), new C1763ks(c1834mp3, c2093tp2.f24375OooO0Oo, 2), c2130up.f24699OooOoo, c2130up.f24683OooOO0, c1834mp3, p31VarOooO0O035, p31VarOooO0O019, c2130up.f24739o00000OO)));
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new k80((C1950pu) p31VarOooO0O015.zzb(), (C2322zw) p31VarOooO0O023.zzb(), (C2320zu) p31VarOooO0O020.zzb(), (C1508dv) p31VarOooO0O010.zzb(), (C1619gv) p31VarOooO0O025.zzb(), (C1473cw) c2093tp2.f24440o00000oO.zzb(), (C1877nv) p31VarOooO0O027.zzb(), (C1694ix) p31VarOooO0O028.zzb(), (C1400aw) p31VarOooO0O030.zzb(), (C2246xu) p31VarOooO0O033.zzb()));
                return (C1917oy) w90Var.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void OooO0O0(rd0 rd0Var, kd0 kd0Var, l60 l60Var) throws JSONException, yd0, IOException {
        switch (this.f16930OooO00o) {
            case 0:
                Object obj = l60Var.f20809OooO0O0;
                try {
                    ((InterfaceC1530eg) obj).oo0o0Oo(kd0Var.f20534OoooOoO);
                    boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue();
                    IInterface iInterface = l60Var.f20810OooO0OO;
                    Context context = this.f16931OooO0O0;
                    JSONObject jSONObject = kd0Var.f20506OooOo0O;
                    if (zBooleanValue && kd0Var.f20542Oooooo0) {
                        ((InterfaceC1530eg) obj).o0OOO0o(kd0Var.f20530OoooOO0, jSONObject.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(context), new z60(this, l60Var), (InterfaceC1383af) iInterface, ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24956OooO0o0);
                        return;
                    } else {
                        ((InterfaceC1530eg) obj).OoooOoO(kd0Var.f20530OoooOO0, jSONObject.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(context), new z60(this, l60Var), (InterfaceC1383af) iInterface, ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24956OooO0o0);
                        return;
                    }
                } catch (RemoteException e) {
                    throw new yd0(e);
                }
            case 1:
                ee0 ee0Var = (ee0) l60Var.f20809OooO0O0;
                vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                String string = kd0Var.f20506OooOo0O.toString();
                String strZzm = zzbs.zzm(kd0Var.f20503OooOOoo);
                Context context2 = this.f16931OooO0O0;
                InterfaceC1383af interfaceC1383af = (InterfaceC1383af) l60Var.f20810OooO0OO;
                try {
                    ee0Var.f18580OooO00o.OooOoOO(new Oooo0o.OooO0OO(context2), vd0Var.f24954OooO0Oo, string, strZzm, interfaceC1383af);
                    return;
                } finally {
                    yd0 yd0Var = new yd0(e);
                }
            default:
                Object obj2 = l60Var.f20809OooO0O0;
                try {
                    ((InterfaceC1530eg) obj2).oo0o0Oo(kd0Var.f20534OoooOoO);
                    int i = ((VersionInfoParcel) this.f16934OooO0o0).clientJarVersion;
                    int iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o000OoOO)).intValue();
                    IInterface iInterface2 = l60Var.f20810OooO0OO;
                    Context context3 = this.f16931OooO0O0;
                    JSONObject jSONObject2 = kd0Var.f20506OooOo0O;
                    if (i < iIntValue) {
                        ((InterfaceC1530eg) obj2).o00000Oo(kd0Var.f20530OoooOO0, jSONObject2.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(context3), new n70(this, l60Var), (InterfaceC1383af) iInterface2);
                        return;
                    } else {
                        ((InterfaceC1530eg) obj2).OooOooo(kd0Var.f20530OoooOO0, jSONObject2.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(context3), new n70(this, l60Var), (InterfaceC1383af) iInterface2, ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24950OooO);
                        return;
                    }
                } catch (RemoteException e2) {
                    throw new yd0(e2);
                }
        }
    }

    public a70(Context context, AbstractC1837ms abstractC1837ms) {
        this.f16931OooO0O0 = context;
        this.f16932OooO0OO = abstractC1837ms;
    }

    public a70(Context context, AbstractC2323zx abstractC2323zx, VersionInfoParcel versionInfoParcel) {
        this.f16931OooO0O0 = context;
        this.f16932OooO0OO = abstractC2323zx;
        this.f16934OooO0o0 = versionInfoParcel;
    }
}
