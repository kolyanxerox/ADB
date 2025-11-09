package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tg */
/* loaded from: classes2.dex */
public final class C2084tg extends C2249xx implements InterfaceC2042sb {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Context f24302OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC1722jo f24303OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final WindowManager f24304OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public DisplayMetrics f24305OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final C2111u6 f24306OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public float f24307OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public int f24308OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public int f24309Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public int f24310Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int f24311Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public int f24312Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public int f24313Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public int f24314Oooo0OO;

    public C2084tg(InterfaceC1722jo interfaceC1722jo, Context context, C2111u6 c2111u6) {
        super(16, interfaceC1722jo, "");
        this.f24308OooOooo = -1;
        this.f24310Oooo000 = -1;
        this.f24312Oooo00o = -1;
        this.f24309Oooo0 = -1;
        this.f24313Oooo0O0 = -1;
        this.f24314Oooo0OO = -1;
        this.f24303OooOoO0 = interfaceC1722jo;
        this.f24302OooOoO = context;
        this.f24306OooOoo0 = c2111u6;
        this.f24304OooOoOO = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f24305OooOoo = new DisplayMetrics();
        Display defaultDisplay = this.f24304OooOoOO.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f24305OooOoo);
        this.f24307OooOooO = this.f24305OooOoo.density;
        this.f24311Oooo00O = defaultDisplay.getRotation();
        zzbc.zzb();
        DisplayMetrics displayMetrics = this.f24305OooOoo;
        this.f24308OooOooo = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
        zzbc.zzb();
        DisplayMetrics displayMetrics2 = this.f24305OooOoo;
        this.f24310Oooo000 = zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
        InterfaceC1722jo interfaceC1722jo = this.f24303OooOoO0;
        Activity activityZzi = interfaceC1722jo.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f24312Oooo00o = this.f24308OooOooo;
            this.f24309Oooo0 = this.f24310Oooo000;
        } else {
            zzv.zzq();
            int[] iArrZzQ = zzs.zzQ(activityZzi);
            zzbc.zzb();
            this.f24312Oooo00o = zzf.zzv(this.f24305OooOoo, iArrZzQ[0]);
            zzbc.zzb();
            this.f24309Oooo0 = zzf.zzv(this.f24305OooOoo, iArrZzQ[1]);
        }
        if (interfaceC1722jo.zzO().OooO0O0()) {
            this.f24313Oooo0O0 = this.f24308OooOooo;
            this.f24314Oooo0OO = this.f24310Oooo000;
        } else {
            interfaceC1722jo.measure(0, 0);
        }
        OooOOOO(this.f24308OooOooo, this.f24310Oooo000, this.f24312Oooo00o, this.f24309Oooo0, this.f24307OooOooO, this.f24311Oooo00O);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C2111u6 c2111u6 = this.f24306OooOoo0;
        boolean zOooO00o = c2111u6.OooO00o(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zOooO00o2 = c2111u6.OooO00o(intent2);
        boolean zOooO00o3 = c2111u6.OooO00o(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        CallableC2074t6 callableC2074t6 = new CallableC2074t6(0);
        Context context = c2111u6.f24565OooOo0O;
        try {
            jSONObjectPut = new JSONObject().put("sms", zOooO00o2).put("tel", zOooO00o).put("calendar", zOooO00o3).put("storePicture", ((Boolean) zzcd.zza(context, callableC2074t6)).booleanValue() && Oooo0o0.OooOO0.OooO00o(context).f13505OooO00o.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e) {
            zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        interfaceC1722jo.OooO0o0("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        interfaceC1722jo.getLocationOnScreen(iArr);
        zzf zzfVarZzb = zzbc.zzb();
        int i = iArr[0];
        Context context2 = this.f24302OooOoO;
        OooOOo(zzfVarZzb.zzb(context2, i), zzbc.zzb().zzb(context2, iArr[1]));
        if (zzo.zzm(2)) {
            zzo.zzi("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC1722jo) this.f25815OooOo0o).OooO0o0("onReadyEventReceived", new JSONObject().put("js", interfaceC1722jo.zzn().afmaVersion));
        } catch (JSONException e2) {
            zzo.zzh("Error occurred while dispatching ready Event.", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOo(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f24302OooOoO
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.internal.zzv.zzq()
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = com.google.android.gms.ads.internal.util.zzs.zzR(r1)
            r1 = r1[r2]
            goto L15
        L14:
            r1 = r2
        L15:
            com.google.android.gms.internal.ads.jo r3 = r8.f24303OooOoO0
            Oooo0oO.o0O0O00 r4 = r3.zzO()
            if (r4 == 0) goto L27
            Oooo0oO.o0O0O00 r4 = r3.zzO()
            boolean r4 = r4.OooO0O0()
            if (r4 != 0) goto L75
        L27:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.v6 r6 = com.google.android.gms.internal.ads.AbstractC1448c7.f17761OooooO0
            com.google.android.gms.internal.ads.a7 r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.OooO00o(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            if (r4 != 0) goto L51
            Oooo0oO.o0O0O00 r4 = r3.zzO()
            if (r4 == 0) goto L50
            Oooo0oO.o0O0O00 r4 = r3.zzO()
            int r4 = r4.f13887OooO0OO
            goto L51
        L50:
            r4 = r2
        L51:
            if (r5 != 0) goto L60
            Oooo0oO.o0O0O00 r5 = r3.zzO()
            if (r5 == 0) goto L61
            Oooo0oO.o0O0O00 r2 = r3.zzO()
            int r2 = r2.f13886OooO0O0
            goto L61
        L60:
            r2 = r5
        L61:
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r4 = r5.zzb(r0, r4)
            r8.f24313Oooo0O0 = r4
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r0 = r4.zzb(r0, r2)
            r8.f24314Oooo0OO = r0
        L75:
            int r0 = r10 - r1
            int r1 = r8.f24313Oooo0O0
            int r2 = r8.f24314Oooo0OO
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> La2
            r4.<init>()     // Catch: org.json.JSONException -> La2
            java.lang.String r5 = "x"
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> La2
            java.lang.String r5 = "y"
            org.json.JSONObject r0 = r4.put(r5, r0)     // Catch: org.json.JSONException -> La2
            java.lang.String r4 = "width"
            org.json.JSONObject r0 = r0.put(r4, r1)     // Catch: org.json.JSONException -> La2
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> La2
            java.lang.Object r1 = r8.f25815OooOo0o     // Catch: org.json.JSONException -> La2
            com.google.android.gms.internal.ads.jo r1 = (com.google.android.gms.internal.ads.InterfaceC1722jo) r1     // Catch: org.json.JSONException -> La2
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.OooO0o0(r2, r0)     // Catch: org.json.JSONException -> La2
            goto La8
        La2:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
        La8:
            com.google.android.gms.internal.ads.no r0 = r3.zzN()
            com.google.android.gms.internal.ads.qg r0 = r0.f21550OoooO0O
            if (r0 == 0) goto Lb4
            r0.f23594OooOoOO = r9
            r0.f23596OooOoo0 = r10
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2084tg.OooOOo(int, int):void");
    }
}
