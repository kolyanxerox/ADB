package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import androidx.core.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f30 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18769OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ApplicationInfo f18770OooO0O0;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f18773OooO0o0 = "";

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f18771OooO0OO = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOO)).intValue();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f18772OooO0Oo = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOO)).intValue();

    public f30(Context context) {
        this.f18769OooO00o = context;
        this.f18770OooO0O0 = context.getApplicationInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject OooO00o() throws JSONException, PackageManager.NameNotFoundException {
        String strZzq;
        String strEncodeToString;
        ApplicationInfo applicationInfo = this.f18770OooO0O0;
        Context context = this.f18769OooO00o;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            pj0 pj0Var = zzs.zza;
            Context context2 = Oooo0o0.OooOO0.OooO00o(context).f13505OooO00o;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, applicationInfo.packageName);
        zzv.zzq();
        Drawable drawable = null;
        try {
            strZzq = zzs.zzq(context);
        } catch (RemoteException unused2) {
            strZzq = null;
        }
        jSONObject.put("adMobAppId", strZzq);
        boolean zIsEmpty = this.f18773OooO0o0.isEmpty();
        int i = this.f18772OooO0Oo;
        int i2 = this.f18771OooO0OO;
        if (zIsEmpty) {
            try {
                OooOOo0.Oooo000 oooo000OooO00o = Oooo0o0.OooOO0.OooO00o(context);
                String str2 = applicationInfo.packageName;
                Context context3 = oooo000OooO00o.f13505OooO00o;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                drawable = (Drawable) Pair.create(context3.getPackageManager().getApplicationLabel(applicationInfo2), context3.getPackageManager().getApplicationIcon(applicationInfo2)).second;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, i2, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f18773OooO0o0 = strEncodeToString;
        }
        if (!this.f18773OooO0o0.isEmpty()) {
            jSONObject.put(C3034d9.h.f8071H0, this.f18773OooO0o0);
            jSONObject.put("iconWidthPx", i2);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }
}
