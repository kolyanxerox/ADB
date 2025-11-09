package o000Ooo0;

import Oooo0.OooO00o;
import Oooo0OO.oo000o;
import OoooO0O.o000O000;
import OoooO0O.o000O0o;
import OoooO0O.o000Oo0;
import OoooO0O.o00O000;
import OoooO0O.o00Ooo;
import OoooO0O.o00oOoo;
import OoooO0O.o0O0ooO;
import OoooOOO.C0001o0;
import OoooOOO.o00O0OOO;
import OoooOOO.o0O;
import OoooOOO.o0O00000;
import OoooOOO.o0O0O0o0;
import OoooOOO.o0O0oo0o;
import OoooOOO.o0OO00o0;
import OoooOOO.o0OO0oO0;
import OoooOOO.oO00000;
import OoooOOO.oO00000o;
import OoooOOO.oO0O0O00;
import OoooOOO.oO0O0OoO;
import OoooOOO.oOO00O0;
import OoooOOO.ooo0Oo0;
import OoooooO.oOo0o00;
import android.app.ActivityManager;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.common.api.internal.OooOOOO;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import io.flutter.plugins.firebase.analytics.Constants;
import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o0000oO0.Oooo0;
import o0000oO0.o000oOoO;
import o0000oOO.o0O00;
import o000O0O0.OooO0OO;
import o000OO0o.OooOO0O;
import o000OO0o.OooOOO0;
import o000OoO.OooOo00;
import o000Ooo.o000000;
import o000Ooo.o000OOo;
import o000Ooo.o00oO0o;
import o000Ooo.o0OO00O;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OooOO0 implements Continuation, OooOOOO, o00O000, UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, o00oOoo, oOO00O0, oOo0o00, Oooo00O.OooOO0, OnApplyWindowInsetsListener, OooOo00, o000O0o.OooOO0, o000OoO.OooOOOO {

    /* renamed from: OooOo */
    public static volatile OooOO0 f30536OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30537OooOo0O;

    /* renamed from: OooOo0o */
    public Object f30538OooOo0o;

    public /* synthetic */ OooOO0(int i, boolean z) {
        this.f30537OooOo0O = i;
    }

    public static String OooO0Oo(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    public static OooOO0 OooOOO(String str) {
        return new OooOO0((TextUtils.isEmpty(str) || str.length() > 1) ? ooo0Oo0.UNINITIALIZED : oO00000o.OooO0o0(str.charAt(0)), 10);
    }

    public void OooO() {
        oO0O0O00 oo0o0o00 = (oO0O0O00) this.f30538OooOo0o;
        oo0o0o00.OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        oo000o oo000oVar = o0oo0oo0.f14527Oooo000;
        oo000oVar.getClass();
        if (o0o.OooOo0(System.currentTimeMillis())) {
            o0O o0o2 = o0oo0oo0.f14518OooOoO;
            o0OO0oO0.OooOO0O(o0o2);
            o0o2.f14194Oooo00O.OooO0O0(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14398Oooo0.OooO0O0("Detected application was in foreground");
                oo000oVar.getClass();
                OooOOOO(System.currentTimeMillis());
            }
        }
    }

    public String OooO00o(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            OooOO0O oooOO0O = (OooOO0O) this.f30538OooOo0o;
            OooOOO0 oooOOO0 = new OooOOO0(stringWriter, oooOO0O.f30224OooO00o, oooOO0O.f30225OooO0O0, oooOO0O.f30226OooO0OO, oooOO0O.f30227OooO0Oo);
            oooOOO0.OooO0oo(obj);
            oooOOO0.OooOO0();
            oooOOO0.f30229OooO0O0.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // o000O0o.OooOO0
    public void OooO0O0(o000OOo o000ooo2) {
        this.f30538OooOo0o = o000ooo2;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    public OooO0OO OooO0OO(JSONObject jSONObject) {
        o000O0O0.OooO0o c0001o0;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c0001o0 = new o0O00000(16);
        } else {
            c0001o0 = new C0001o0(17);
        }
        return c0001o0.OooO0Oo((C0001o0) this.f30538OooOo0o, jSONObject);
    }

    public void OooO0o(int i, long j) {
        Vibrator vibrator = (Vibrator) this.f30538OooOo0o;
        if (vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                vibrator.vibrate(j);
            } else if (vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                vibrator.vibrate(VibrationEffect.createOneShot(j, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }

    @Override // o000OoO.OooOOOO
    public void OooO0o0(Bundle bundle) {
        ((o000oOoO) ((Oooo0) this.f30538OooOo0o)).OooO00o("clx", bundle, io.flutter.plugins.firebase.crashlytics.Constants.FIREBASE_APPLICATION_EXCEPTION);
    }

    public void OooO0oO(int i, List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        Vibrator vibrator = (Vibrator) this.f30538OooOo0o;
        if (vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                vibrator.vibrate(jArr, i);
            }
        }
    }

    public void OooO0oo(List list, int i, List list2) {
        int size = list.size();
        long[] jArr = new long[size];
        int size2 = list2.size();
        int[] iArr = new int[size2];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        for (int i3 = 0; i3 < size2; i3++) {
            iArr[i3] = ((Integer) list2.get(i3)).intValue();
        }
        Vibrator vibrator = (Vibrator) this.f30538OooOo0o;
        if (vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                vibrator.vibrate(jArr, i);
            } else if (vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, i), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }

    @Override // OoooOOO.oOO00O0
    public void OooOO0(String str, Bundle bundle, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f30538OooOo0o;
        if (!zIsEmpty) {
            oo0o0ooo.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14527Oooo000.getClass();
        oo0o0ooo.OooOOOo("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    public void OooOO0O(int i, String str, List list, boolean z, boolean z2) {
        o0O0oo0o o0o0oo0o;
        int i2 = i - 1;
        o0OO00o0 o0oo00o0 = (o0OO00o0) this.f30538OooOo0o;
        if (i2 == 0) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0oo0o = o0o0o0o0.f14401Oooo00o;
        } else if (i2 != 1) {
            if (i2 == 3) {
                o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0oo0o = o0o0o0o02.f14398Oooo0;
            } else if (i2 != 4) {
                o0O0O0o0 o0o0o0o03 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o03);
                o0o0oo0o = o0o0o0o03.f14400Oooo00O;
            } else if (z) {
                o0O0O0o0 o0o0o0o04 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o04);
                o0o0oo0o = o0o0o0o04.f14397OooOooo;
            } else if (z2) {
                o0O0O0o0 o0o0o0o05 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o05);
                o0o0oo0o = o0o0o0o05.f14396OooOooO;
            } else {
                o0O0O0o0 o0o0o0o06 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o06);
                o0o0oo0o = o0o0o0o06.f14399Oooo000;
            }
        } else if (z) {
            o0O0O0o0 o0o0o0o07 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o07);
            o0o0oo0o = o0o0o0o07.f14395OooOoo0;
        } else if (z2) {
            o0O0O0o0 o0o0o0o08 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o08);
            o0o0oo0o = o0o0o0o08.f14393OooOoOO;
        } else {
            o0O0O0o0 o0o0o0o09 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o09);
            o0o0oo0o = o0o0o0o09.f14394OooOoo;
        }
        int size = list.size();
        if (size == 1) {
            o0o0oo0o.OooO0OO(list.get(0), str);
            return;
        }
        if (size == 2) {
            o0o0oo0o.OooO0Oo(list.get(0), str, list.get(1));
        } else if (size != 3) {
            o0o0oo0o.OooO0O0(str);
        } else {
            o0o0oo0o.OooO0o0(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void OooOO0o(long j) {
        oO0O0O00 oo0o0o00 = (oO0O0O00) this.f30538OooOo0o;
        oo0o0o00.OooOO0O();
        oo0o0o00.OooOOOO();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        boolean zOooOo0 = o0o.OooOo0(j);
        o0O o0o2 = o0oo0oo0.f14518OooOoO;
        if (zOooOo0) {
            o0OO0oO0.OooOO0O(o0o2);
            o0o2.f14194Oooo00O.OooO0O0(true);
            o0oo0oo0.OooOOo().OooOOOo();
        }
        o0OO0oO0.OooOO0O(o0o2);
        o0o2.f14197Oooo0OO.OooO0O0(j);
        if (o0o2.f14194Oooo00O.OooO00o()) {
            OooOOOO(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooOOO0(OoooOOO.oO00000 r3, int r4) {
        /*
            r2 = this;
            OoooOOO.o00O0OOO r0 = OoooOOO.o00O0OOO.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            OoooOOO.o00O0OOO r0 = OoooOOO.o00O0OOO.INITIALIZATION
            goto L20
        L18:
            OoooOOO.o00O0OOO r0 = OoooOOO.o00O0OOO.MANIFEST
            goto L20
        L1b:
            OoooOOO.o00O0OOO r0 = OoooOOO.o00O0OOO.API
            goto L20
        L1e:
            OoooOOO.o00O0OOO r0 = OoooOOO.o00O0OOO.TCF
        L20:
            java.lang.Object r4 = r2.f30538OooOo0o
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Ooo0.OooOO0.OooOOO0(OoooOOO.oO00000, int):void");
    }

    public void OooOOOO(long j) {
        oO0O0O00 oo0o0o00 = (oO0O0O00) this.f30538OooOo0o;
        oo0o0o00.OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        if (o0oo0oo0.OooO0o()) {
            o0O o0o = o0oo0oo0.f14518OooOoO;
            o0OO0oO0.OooOO0O(o0o);
            o0o.f14197Oooo0OO.OooO0O0(j);
            o0oo0oo0.f14527Oooo000.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0OO(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long lValueOf = Long.valueOf(j2);
            oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOo0O(j, lValueOf, "auto", "_sid");
            o0OO0oO0.OooOO0O(o0o);
            o0o.f14199Oooo0o0.OooO0O0(j2);
            o0o.f14194Oooo00O.OooO0O0(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOOoo(j, bundle, "auto", "_s");
            String strOooO0Oo = o0o.f14204OoooO00.OooO0Oo();
            if (TextUtils.isEmpty(strOooO0Oo)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strOooO0Oo);
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOOoo(j, bundle2, "auto", "_ssr");
        }
    }

    public void OooOOOo(oO00000 oo00000, o00O0OOO o00o0ooo) {
        ((EnumMap) this.f30538OooOo0o).put((EnumMap) oo00000, (oO00000) o00o0ooo);
    }

    @Override // com.google.android.gms.common.api.internal.OooOOOO
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        OooO00o oooO00o = (OooO00o) ((Oooo0.OooO0OO) obj).getService();
        oooO00o.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(oooO00o.f13892OooOo);
        int i = OoooO00.OooOOO0.f13898OooO00o;
        Oooo00O.o000oOoO o000oooo2 = (Oooo00O.o000oOoO) this.f30538OooOo0o;
        if (o000oooo2 == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            o000oooo2.writeToParcel(parcelObtain, 0);
        }
        try {
            oooO00o.f13894OooOo0o.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.f30537OooOo0O) {
            case 18:
                AppBarLayout appBarLayout = (AppBarLayout) this.f30538OooOo0o;
                WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(appBarLayout) ? windowInsetsCompat : null;
                if (!ObjectsCompat.equals(appBarLayout.f27237OooOoo0, windowInsetsCompat2)) {
                    appBarLayout.f27237OooOoo0 = windowInsetsCompat2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.f27246Oooo0o != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                return windowInsetsCompat;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f30538OooOo0o;
                collapsingToolbarLayout.getClass();
                WindowInsetsCompat windowInsetsCompat3 = ViewCompat.getFitsSystemWindows(collapsingToolbarLayout) ? windowInsetsCompat : null;
                if (!ObjectsCompat.equals(collapsingToolbarLayout.f27278OoooO, windowInsetsCompat3)) {
                    collapsingToolbarLayout.f27278OoooO = windowInsetsCompat3;
                    collapsingToolbarLayout.requestLayout();
                }
                return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((ConsentForm.OnConsentFormDismissedListener) this.f30538OooOo0o).onConsentFormDismissed(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((AtomicReference) this.f30538OooOo0o).set(consentForm);
    }

    @Override // o000OoO.OooOo00
    public void onEvent(String str, Bundle bundle) {
        o000OOo o000ooo2 = (o000OOo) this.f30538OooOo0o;
        if (o000ooo2 != null) {
            try {
                String str2 = "$A$:" + OooO0Oo(bundle, str);
                o000000 o000000Var = o000ooo2.f30474OooO00o;
                o000000Var.getClass();
                o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new o0OO00O(o000000Var, System.currentTimeMillis() - o000000Var.f30436OooO0Oo, str2, 1));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof Oooo000.OooO0o)) {
            return task;
        }
        int iOooO0o = ((Oooo000.OooO0o) exception).f13723OooOo0O.OooO0o();
        return (iOooO0o == 43001 || iOooO0o == 43002 || iOooO0o == 43003 || iOooO0o == 17) ? ((Oooo.OooOo00) ((OooO0oO.OooOOO0) this.f30538OooOo0o).f13278OooOo).getAppSetIdInfo() : iOooO0o == 43000 ? Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : iOooO0o != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    public String toString() {
        switch (this.f30537OooOo0O) {
            case 9:
                StringBuilder sb = new StringBuilder("1");
                for (oO00000 oo00000 : oO00000.values()) {
                    o00O0OOO o00o0ooo = (o00O0OOO) ((EnumMap) this.f30538OooOo0o).get(oo00000);
                    if (o00o0ooo == null) {
                        o00o0ooo = o00O0OOO.UNSET;
                    }
                    sb.append(o00o0ooo.f14134OooOo0O);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // OoooO0O.o00O000
    public Object zza() {
        switch (this.f30537OooOo0O) {
            case 4:
                return new OoooO0O.oo000o((o00Ooo) ((o00Ooo) this.f30538OooOo0o).f14024OooO00o);
            case 7:
                o000O000 o000o0002 = o000O0o.f13968OooO0O0;
                o000Oo0.OooO0OO(o000o0002);
                return new OoooO0O.o000OOo((OooOO0) this.f30538OooOo0o, o000o0002);
            default:
                o0O0ooO o0o0ooo = (o0O0ooO) this.f30538OooOo0o;
                if (o0o0ooo != null) {
                    return o0o0ooo.zza();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f30537OooOo0O = i;
        this.f30538OooOo0o = obj;
    }

    public OooOO0(o0OO00o0 o0oo00o0) {
        this.f30537OooOo0O = 12;
        Objects.requireNonNull(o0oo00o0);
        this.f30538OooOo0o = o0oo00o0;
    }

    public OooOO0(oO0O0OoO oo0o0ooo) {
        this.f30537OooOo0O = 13;
        Objects.requireNonNull(oo0o0ooo);
        this.f30538OooOo0o = oo0o0ooo;
    }

    public OooOO0(oO0O0O00 oo0o0o00) {
        this.f30537OooOo0O = 15;
        Objects.requireNonNull(oo0o0o00);
        this.f30538OooOo0o = oo0o0o00;
    }

    public OooOO0(o00oO0o o00oo0o, OooO0oO.OooOOO0 oooOOO0) {
        this.f30537OooOo0O = 22;
        this.f30538OooOo0o = oooOOO0;
        o00oo0o.OooO0o(new o0O00(this));
    }

    public OooOO0(EnumMap enumMap) {
        this.f30537OooOo0O = 9;
        EnumMap enumMap2 = new EnumMap(oO00000.class);
        this.f30538OooOo0o = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public OooOO0(int i) {
        this.f30537OooOo0O = i;
        switch (i) {
            case 9:
                this.f30538OooOo0o = new EnumMap(oO00000.class);
                break;
            default:
                this.f30538OooOo0o = new HashSet();
                break;
        }
    }
}
