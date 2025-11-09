package com.google.android.gms.ads.internal.util;

import OooO0oO.OooOo;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.m30;
import com.google.android.gms.internal.ads.p30;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzau {

    /* renamed from: OooO, reason: collision with root package name */
    public PointF f16197OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16198OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p30 f16199OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f16200OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public String f16201OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f16202OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f16203OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f16204OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f16205OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public PointF f16206OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final Handler f16207OooOO0O;
    public final zzaf OooOO0o;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.util.zzaf] */
    public zzau(Context context) {
        this.f16204OooO0oO = 0;
        this.OooOO0o = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                zzau zzauVar = this.zza;
                zzauVar.f16204OooO0oO = 4;
                zzauVar.zzr();
            }
        };
        this.f16198OooO00o = context;
        this.f16205OooO0oo = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.f16207OooOO0O = com.google.android.gms.ads.internal.zzv.zzu().zza();
        this.f16199OooO0O0 = com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    public static final int OooO0OO(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void OooO00o(Context context) {
        ArrayList arrayList = new ArrayList();
        int iOooO0OO = OooO0OO(arrayList, OfficeOpenXMLExtended.SECURITY_NONE, true);
        final int iOooO0OO2 = OooO0OO(arrayList, "Shake", true);
        final int iOooO0OO3 = OooO0OO(arrayList, "Flick", true);
        int iOrdinal = this.f16199OooO0O0.f23204OooOOo.ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iOooO0OO : iOooO0OO3 : iOooO0OO2;
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderZzL.setTitle("Setup gesture");
        builderZzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderZzL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzr();
            }
        });
        builderZzL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzau zzauVar = this.zza;
                AtomicInteger atomicInteger2 = atomicInteger;
                int i3 = i;
                int i4 = iOooO0OO2;
                int i5 = iOooO0OO3;
                zzauVar.getClass();
                if (atomicInteger2.get() != i3) {
                    int i6 = atomicInteger2.get();
                    p30 p30Var = zzauVar.f16199OooO0O0;
                    if (i6 == i4) {
                        p30Var.OooOO0(m30.f21044OooOo0o, true);
                    } else if (atomicInteger2.get() == i5) {
                        p30Var.OooOO0(m30.f21042OooOo, true);
                    } else {
                        p30Var.OooOO0(m30.f21043OooOo0O, true);
                    }
                }
                zzauVar.zzr();
            }
        });
        builderZzL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzL.create().show();
    }

    public final boolean OooO0O0(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.f16197OooO.x - f);
        int i = this.f16205OooO0oo;
        return fAbs < ((float) i) && Math.abs(this.f16197OooO.y - f2) < ((float) i) && Math.abs(this.f16206OooOO0.x - f3) < ((float) i) && Math.abs(this.f16206OooOO0.y - f4) < ((float) i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f16200OooO0OO);
        sb.append(",DebugSignal: ");
        sb.append(this.f16202OooO0o);
        sb.append(",AFMA Version: ");
        sb.append(this.f16203OooO0o0);
        sb.append(",Ad Unit ID: ");
        return OooOo.OooOOOo(sb, this.f16201OooO0Oo, "}");
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f16204OooO0oO = 0;
            this.f16197OooO = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f16204OooO0oO;
        if (i == -1) {
            return;
        }
        zzaf zzafVar = this.OooOO0o;
        Handler handler = this.f16207OooOO0O;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f16204OooO0oO = 5;
                this.f16206OooOO0 = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(zzafVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0O00)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !OooO0O0(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (OooO0O0(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f16204OooO0oO = -1;
            handler.removeCallbacks(zzafVar);
        }
    }

    public final void zzn(String str) {
        this.f16201OooO0Oo = str;
    }

    public final void zzo(String str) {
        this.f16203OooO0o0 = str;
    }

    public final void zzp(String str) {
        this.f16200OooO0OO = str;
    }

    public final void zzq(String str) {
        this.f16202OooO0o = str;
    }

    public final void zzr() {
        Context context = this.f16198OooO00o;
        try {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzv.zzt().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iOooO0OO = OooO0OO(arrayList, "Ad information", true);
            final int iOooO0OO2 = OooO0OO(arrayList, str, true);
            final int iOooO0OO3 = OooO0OO(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue();
            final int iOooO0OO4 = OooO0OO(arrayList, "Open ad inspector", zBooleanValue);
            final int iOooO0OO5 = OooO0OO(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder builderZzL = zzs.zzL(context);
            builderZzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final zzau zzauVar = this.zza;
                    int i2 = iOooO0OO;
                    int i3 = iOooO0OO2;
                    int i4 = iOooO0OO3;
                    int i5 = iOooO0OO4;
                    int i6 = iOooO0OO5;
                    zzauVar.getClass();
                    if (i != i2) {
                        if (i == i3) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Creative Preview] selected.");
                            AbstractC2200wl.f25321OooO00o.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzau zzauVar2 = zzauVar;
                                    zzauVar2.getClass();
                                    zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                                    Context context2 = zzauVar2.f16198OooO00o;
                                    String str3 = zzauVar2.f16201OooO0Oo;
                                    String str4 = zzauVar2.f16203OooO0o0;
                                    zzayVarZzt.getClass();
                                    String strOooO0O0 = zzay.OooO0O0(context2, zzayVarZzt.OooO0OO(context2, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0O0O), str3, str4).toString(), str4);
                                    if (TextUtils.isEmpty(strOooO0O0)) {
                                        com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strOooO0O0.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            zzayVarZzt.f16218OooO0o = jSONObject.optString("status");
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
                                                boolean z = "0".equals(zzayVarZzt.f16218OooO0o) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(zzayVarZzt.f16218OooO0o);
                                                zzayVarZzt.zzf(z);
                                                com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo().zzw(!z ? "" : str3);
                                            }
                                            synchronized (zzayVarZzt.f16214OooO00o) {
                                                zzayVarZzt.f16216OooO0OO = strOptString;
                                            }
                                            if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(zzayVarZzt.f16218OooO0o)) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zze("Creative is not pushed for this device.");
                                                zzay.OooO00o(context2, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(zzayVarZzt.f16218OooO0o)) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zze("The app is not linked for creative preview.");
                                                zzayVarZzt.zzd(context2, str3, str4);
                                                return;
                                            } else {
                                                if ("0".equals(zzayVarZzt.f16218OooO0o)) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for in app preview.");
                                                    zzay.OooO00o(context2, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get in app preview response json.", e);
                                        }
                                    }
                                    zzay.OooO00o(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        }
                        if (i == i4) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Troubleshooting] selected.");
                            AbstractC2200wl.f25321OooO00o.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzau zzauVar2 = zzauVar;
                                    zzauVar2.getClass();
                                    zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                                    String str3 = zzauVar2.f16201OooO0Oo;
                                    String str4 = zzauVar2.f16203OooO0o0;
                                    String str5 = zzauVar2.f16202OooO0o;
                                    boolean zZzm = zzayVarZzt.zzm();
                                    Context context2 = zzauVar2.f16198OooO00o;
                                    zzayVarZzt.zzh(zzayVarZzt.zzj(context2, str3, str4));
                                    if (!zzayVarZzt.zzm()) {
                                        zzayVarZzt.zzd(context2, str3, str4);
                                        return;
                                    }
                                    if (!zZzm && !TextUtils.isEmpty(str5)) {
                                        zzayVarZzt.zze(context2, str4, str5, str3);
                                    }
                                    com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for debug signals.");
                                    zzay.OooO00o(context2, "The device is successfully linked for troubleshooting.", false, true);
                                }
                            });
                            return;
                        }
                        p30 p30Var = zzauVar.f16199OooO0O0;
                        if (i == i5) {
                            final C2163vl c2163vl = AbstractC2200wl.f25325OooO0o;
                            C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                            if (p30Var.OooO0o()) {
                                c2163vl.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzau zzauVar2 = zzauVar;
                                        zzauVar2.getClass();
                                        com.google.android.gms.ads.internal.zzv.zzt().zzc(zzauVar2.f16198OooO00o);
                                    }
                                });
                                return;
                            } else {
                                c2163vl2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzau zzauVar2 = zzauVar;
                                        cq0 cq0Var = c2163vl;
                                        zzauVar2.getClass();
                                        zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                                        String str3 = zzauVar2.f16201OooO0Oo;
                                        String str4 = zzauVar2.f16203OooO0o0;
                                        Context context2 = zzauVar2.f16198OooO00o;
                                        if (zzayVarZzt.zzj(context2, str3, str4)) {
                                            cq0Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzau zzauVar3 = zzauVar2;
                                                    zzauVar3.getClass();
                                                    com.google.android.gms.ads.internal.zzv.zzt().zzc(zzauVar3.f16198OooO00o);
                                                }
                                            });
                                        } else {
                                            com.google.android.gms.ads.internal.zzv.zzt().zzd(context2, zzauVar2.f16201OooO0Oo, zzauVar2.f16203OooO0o0);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == i6) {
                            final C2163vl c2163vl3 = AbstractC2200wl.f25325OooO0o;
                            C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                            if (p30Var.OooO0o()) {
                                c2163vl3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzau zzauVar2 = zzauVar;
                                        zzauVar2.OooO00o(zzauVar2.f16198OooO00o);
                                    }
                                });
                                return;
                            } else {
                                c2163vl4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzau zzauVar2 = zzauVar;
                                        cq0 cq0Var = c2163vl3;
                                        zzauVar2.getClass();
                                        zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                                        String str3 = zzauVar2.f16201OooO0Oo;
                                        String str4 = zzauVar2.f16203OooO0o0;
                                        Context context2 = zzauVar2.f16198OooO00o;
                                        if (zzayVarZzt.zzj(context2, str3, str4)) {
                                            cq0Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzau zzauVar3 = zzauVar2;
                                                    zzauVar3.OooO00o(zzauVar3.f16198OooO00o);
                                                }
                                            });
                                        } else {
                                            com.google.android.gms.ads.internal.zzv.zzt().zzd(context2, zzauVar2.f16201OooO0Oo, zzauVar2.f16203OooO0o0);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzauVar.f16198OooO00o;
                    if (!(context2 instanceof Activity)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = zzauVar.f16200OooO0OO;
                    final String str4 = "No debug information";
                    if (!TextUtils.isEmpty(str3)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        com.google.android.gms.ads.internal.zzv.zzq();
                        Map mapZzP = zzs.zzP(uriBuild);
                        for (String str5 : mapZzP.keySet()) {
                            sb.append(str5);
                            sb.append(" = ");
                            sb.append((String) mapZzP.get(str5));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str4 = strTrim;
                        }
                    }
                    com.google.android.gms.ads.internal.zzv.zzq();
                    AlertDialog.Builder builderZzL2 = zzs.zzL(context2);
                    builderZzL2.setMessage(str4);
                    builderZzL2.setTitle("Ad Information");
                    builderZzL2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                            zzau zzauVar2 = zzauVar;
                            String str6 = str4;
                            zzauVar2.getClass();
                            com.google.android.gms.ads.internal.zzv.zzq();
                            zzs.zzT(zzauVar2.f16198OooO00o, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str6), "Share via"));
                        }
                    });
                    builderZzL2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                        }
                    });
                    builderZzL2.create().show();
                }
            });
            builderZzL.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.f16200OooO0OO = str;
    }
}
