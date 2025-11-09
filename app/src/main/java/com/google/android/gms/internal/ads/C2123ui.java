package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ui */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2123ui implements wk0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24648OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f24649OooO0O0;

    public /* synthetic */ C2123ui(Object obj, int i) {
        this.f24648OooO00o = i;
        this.f24649OooO0O0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final Object apply(Object obj) {
        boolean z;
        String str;
        int i;
        int i2;
        String strZzj;
        float f;
        int i3;
        DisplayMetrics displayMetrics;
        int i4 = 0;
        boolean z2 = true;
        Object obj2 = this.f24649OooO0O0;
        switch (this.f24648OooO00o) {
            case 0:
                int i5 = 1;
                JSONObject jSONObject = (JSONObject) obj;
                OooOOo0.o0OOO0o o0ooo0o = (OooOOo0.o0OOO0o) obj2;
                o0ooo0o.getClass();
                C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
                zzbe.zzb();
                SharedPreferences sharedPreferencesOooO00o = C2259y6.OooO00o((Context) o0ooo0o.f13516OooOo);
                if (sharedPreferencesOooO00o != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesOooO00o.edit();
                    zzbe.zza();
                    ArrayList arrayList = zzbe.zza().f25526OooO00o;
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        C2148v6 c2148v62 = (C2148v6) obj3;
                        int i6 = i5;
                        if (c2148v62.f24856OooO00o == i6) {
                            Object objOooO00o = c2148v62.OooO00o(jSONObject);
                            switch (c2148v62.f24860OooO0o0) {
                                case 0:
                                    editorEdit.putBoolean(c2148v62.f24857OooO0O0, ((Boolean) objOooO00o).booleanValue());
                                    break;
                                case 1:
                                    editorEdit.putInt(c2148v62.f24857OooO0O0, ((Integer) objOooO00o).intValue());
                                    break;
                                case 2:
                                    editorEdit.putLong(c2148v62.f24857OooO0O0, ((Long) objOooO00o).longValue());
                                    break;
                                case 3:
                                    editorEdit.putFloat(c2148v62.f24857OooO0O0, ((Float) objOooO00o).floatValue());
                                    break;
                                default:
                                    editorEdit.putString(c2148v62.f24857OooO0O0, (String) objOooO00o);
                                    break;
                            }
                        }
                        i5 = i6;
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzo.zzg("Flag Json is null.");
                    }
                    zzbe.zzb();
                    editorEdit.commit();
                    SharedPreferences sharedPreferences = (SharedPreferences) o0ooo0o.f13520OooOoO0;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        editorEdit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                }
                return null;
            case 1:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                z00 z00Var = (z00) obj2;
                interfaceC1722jo.Oooo0OO("/result", z00Var.f26058OooO0oo);
                AbstractC1870no abstractC1870noZzN = interfaceC1722jo.zzN();
                zzb zzbVar = new zzb(z00Var.f26053OooO0OO, null, null);
                s00 s00Var = z00Var.f26051OooO00o;
                abstractC1870noZzN.OooOOO(null, s00Var, s00Var, s00Var, s00Var, false, null, zzbVar, null, null, z00Var.f26050OooO, z00Var.f26059OooOO0, z00Var.f26054OooO0Oo, null, null, null, null, null, null);
                return interfaceC1722jo;
            case 2:
                return ((C2278yp) obj2).o00Ooo();
            case 3:
                m90 m90Var = (m90) obj2;
                vd0 vd0Var = (vd0) m90Var.f21147OooO0O0;
                zzs zzsVar = vd0Var.f24956OooO0o0;
                zzs[] zzsVarArr = zzsVar.zzg;
                if (zzsVarArr == null) {
                    String str2 = zzsVar.zza;
                    z = zzsVar.zzi;
                    str = str2;
                } else {
                    z = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    str = null;
                    for (zzs zzsVar2 : zzsVarArr) {
                        boolean z5 = zzsVar2.zzi;
                        if (!z5 && !z3) {
                            str = zzsVar2.zza;
                            z3 = true;
                        }
                        if (z5) {
                            if (z4) {
                                z4 = true;
                            } else {
                                z = true;
                                z4 = true;
                            }
                        }
                        if (!z3 || !z4) {
                        }
                    }
                }
                Resources resources = ((Context) m90Var.f21148OooO0OO).getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    i = 0;
                    i2 = 0;
                    strZzj = null;
                    f = 0.0f;
                } else {
                    float f2 = displayMetrics.density;
                    int i7 = displayMetrics.widthPixels;
                    int i8 = displayMetrics.heightPixels;
                    strZzj = ((C1978ql) m90Var.f21150OooO0o0).OooO0Oo().zzj();
                    i2 = i8;
                    i = i7;
                    f = f2;
                }
                StringBuilder sb = new StringBuilder();
                zzs[] zzsVarArr2 = zzsVar.zzg;
                if (zzsVarArr2 != null) {
                    int i9 = 0;
                    boolean z6 = false;
                    while (true) {
                        boolean z7 = z2;
                        if (i9 < zzsVarArr2.length) {
                            zzs zzsVar3 = zzsVarArr2[i9];
                            if (zzsVar3.zzi) {
                                z6 = z7;
                            } else {
                                if (sb.length() != 0) {
                                    sb.append("|");
                                }
                                int i10 = zzsVar3.zze;
                                if (i10 == -1) {
                                    i10 = f != 0.0f ? (int) (zzsVar3.zzf / f) : -1;
                                }
                                sb.append(i10);
                                sb.append("x");
                                int i11 = zzsVar3.zzb;
                                if (i11 == -2) {
                                    i11 = f != 0.0f ? (int) (zzsVar3.zzc / f) : -2;
                                }
                                sb.append(i11);
                            }
                            i9++;
                            z2 = z7;
                        } else if (z6) {
                            if (sb.length() != 0) {
                                i3 = 0;
                                sb.insert(0, "|");
                            } else {
                                i3 = 0;
                            }
                            sb.insert(i3, "320x50");
                        }
                    }
                }
                return new u90(zzsVar, str, z, sb.toString(), f, i, i2, strZzj, vd0Var.f24966OooOOo0);
            case 4:
                ((ca0) obj2).f17978OooO00o.OooO0oo("AppSetIdInfoSignal", (Exception) obj);
                return new da0(null, -1, 0);
            case 5:
                ((C1978ql) ((t90) obj2).f24275OooO0O0).OooO0oo("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new da0(null, -1, 3);
            case 6:
                ((bc0) obj2).f17473OooO00o.OooO0oo("TrustlessTokenSignal", (Exception) obj);
                return new r90(null, 5);
            default:
                oe0 oe0Var = (oe0) obj2;
                oe0Var.f22981OooO0OO = (AbstractC1397at) obj;
                return oe0Var;
        }
    }
}
