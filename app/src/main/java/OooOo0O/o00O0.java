package OoooO0O;

import Oooo.OooOo00;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class o00O0 {

    /* renamed from: OooO00o */
    public final oo00o f13987OooO00o;

    /* renamed from: OooO0O0 */
    public final Activity f13988OooO0O0;

    /* renamed from: OooO0OO */
    public final ConsentDebugSettings f13989OooO0OO;

    /* renamed from: OooO0Oo */
    public final ConsentRequestParameters f13990OooO0Oo;

    public /* synthetic */ o00O0(oo00o oo00oVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters) {
        this.f13987OooO00o = oo00oVar;
        this.f13988OooO0O0 = activity;
        this.f13989OooO0OO = consentDebugSettings;
        this.f13990OooO0Oo = consentRequestParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static OooOOOo.o0ooOOo OooO00o(o00O0 o00o0) throws o00O00, PackageManager.NameNotFoundException {
        Bundle bundle;
        List list;
        PackageInfo packageInfo;
        OooOOOo.o0ooOOo o0ooooo = new OooOOOo.o0ooOOo();
        o0ooooo.f13435OooO0o0 = Collections.EMPTY_MAP;
        o0ooooo.f13429OooO = Collections.EMPTY_LIST;
        ConsentRequestParameters consentRequestParameters = o00o0.f13990OooO0Oo;
        String strZza = consentRequestParameters.zza();
        boolean zIsEmpty = TextUtils.isEmpty(strZza);
        oo00o oo00oVar = o00o0.f13987OooO00o;
        if (zIsEmpty) {
            try {
                bundle = oo00oVar.f14063OooO00o.getPackageManager().getApplicationInfo(oo00oVar.f14063OooO00o.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new o00O00(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        o0ooooo.f13430OooO00o = strZza;
        ConsentDebugSettings consentDebugSettings = o00o0.f13989OooO0OO;
        if (consentDebugSettings.isTestDevice()) {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(o0000.f13904OooOo0O);
            } else if (debugGeography == 2) {
                arrayList.add(o0000.f13907OooOoO0);
            } else if (debugGeography == 3) {
                arrayList.add(o0000.f13905OooOo0o);
            } else if (debugGeography == 4) {
                arrayList.add(o0000.f13903OooOo);
            }
            arrayList.add(o0000.f13906OooOoO);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        o0ooooo.f13429OooO = list;
        o0ooooo.f13435OooO0o0 = oo00oVar.f14064OooO0O0.OooO00o();
        o0ooooo.f13433OooO0Oo = Boolean.valueOf(consentRequestParameters.isTagForUnderAgeOfConsent());
        o0ooooo.f13432OooO0OO = Locale.getDefault().toLanguageTag();
        o0000O00 o0000o00 = new o0000O00(0, (byte) 0);
        o0000o00.f13928OooO0O0 = 1;
        int i = Build.VERSION.SDK_INT;
        o0000o00.f13930OooO0Oo = Integer.valueOf(i);
        o0000o00.f13929OooO0OO = Build.MODEL;
        o0000o00.f13928OooO0O0 = 2;
        o0ooooo.f13431OooO0O0 = o0000o00;
        Application application = oo00oVar.f14063OooO00o;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        C1386ai c1386ai = new C1386ai(3, false);
        Object arrayList2 = Collections.EMPTY_LIST;
        c1386ai.f17045OooOoO = arrayList2;
        c1386ai.f17044OooOo0o = Integer.valueOf(configuration.screenWidthDp);
        c1386ai.f17042OooOo = Integer.valueOf(configuration.screenHeightDp);
        c1386ai.f17046OooOoO0 = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Activity activity = o00o0.f13988OooO0O0;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        o0000oo o0000ooVar = new o0000oo();
                        o0000ooVar.f13951OooO0O0 = Integer.valueOf(rect.left);
                        o0000ooVar.f13952OooO0OO = Integer.valueOf(rect.right);
                        o0000ooVar.f13950OooO00o = Integer.valueOf(rect.top);
                        o0000ooVar.f13953OooO0Oo = Integer.valueOf(rect.bottom);
                        arrayList2.add(o0000ooVar);
                    }
                }
            }
        }
        c1386ai.f17045OooOoO = arrayList2;
        o0ooooo.f13434OooO0o = c1386ai;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        OooOo00 oooOo00 = new OooOo00(7);
        oooOo00.f13712OooOo0o = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        oooOo00.f13710OooOo = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            oooOo00.f13713OooOoO0 = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        o0ooooo.f13436OooO0oO = oooOo00;
        o0ooooo.f13437OooO0oo = new OooO(9);
        return o0ooooo;
    }
}
