package OoooOOO;

import Oooo0oO.o0000Ooo;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.internal.measurement.C2328b;
import com.google.android.gms.internal.measurement.C2334e;
import com.google.android.gms.internal.measurement.C2348oO;
import com.google.android.gms.internal.measurement.Oo0000;
import com.google.android.gms.internal.measurement.oOO0O00O;
import com.google.android.gms.internal.measurement.oOOOoo00;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.OooOo;
import o00000.OooOo00;
import o0000Oo.o000oOoO;
import o0000oo0.o00Oo0;
import o0000oo0.o00oO0o;
import o000O0O0.OooO0OO;
import o000O0O0.OooO0o;
import o000O0o0.OooOO0;
import o000OoO.OooOOOO;
import o00OOOoO.o0000O0;
import o00OOOoO.o000O0Oo;
import o00OOoo.Oooo0;
import o0ooOO0.o0000;
import o0ooOO0.o0000O00;
import o0ooOO0.o0000oo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public /* synthetic */ class o0O00000 implements o00Oo00, o0000, o000oOoO, o00oO0o, OooO0o, OooOO0, OooOOOO, SuccessContinuation {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14222OooOo0O;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ o0O00000 f14213OooOo0o = new o0O00000(0);

    /* renamed from: OooOo */
    public static final /* synthetic */ o0O00000 f14212OooOo = new o0O00000(1);

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ o0O00000 f14215OooOoO0 = new o0O00000(2);

    /* renamed from: OooOoO */
    public static final /* synthetic */ o0O00000 f14214OooOoO = new o0O00000(3);

    /* renamed from: OooOoOO */
    public static final /* synthetic */ o0O00000 f14216OooOoOO = new o0O00000(4);

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ o0O00000 f14218OooOoo0 = new o0O00000(5);

    /* renamed from: OooOoo */
    public static final /* synthetic */ o0O00000 f14217OooOoo = new o0O00000(6);

    /* renamed from: OooOooO */
    public static final /* synthetic */ o0O00000 f14219OooOooO = new o0O00000(7);

    /* renamed from: OooOooo */
    public static final /* synthetic */ o0O00000 f14220OooOooo = new o0O00000(8);

    /* renamed from: Oooo000 */
    public static final /* synthetic */ o0O00000 f14221Oooo000 = new o0O00000(15);

    public /* synthetic */ o0O00000(int i) {
        this.f14222OooOo0O = i;
    }

    public static o000O0Oo OooO(String str, boolean z) {
        OooOo.OooO0o0(str, "<this>");
        o0000O0 o0000o02 = Oooo0.f32611OooO00o;
        o00OOOoO.o0000 o0000Var = new o00OOOoO.o0000();
        o0000Var.OooOOOO(str);
        return Oooo0.OooO0Oo(o0000Var, z);
    }

    public static RectF OooO0oO(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f27851OoooOOO || !(view instanceof OooOo00)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        OooOo00 oooOo00 = (OooOo00) view;
        int contentWidth = oooOo00.getContentWidth();
        int contentHeight = oooOo00.getContentHeight();
        int iOooO0O0 = (int) o0000oo.OooO0O0(oooOo00.getContext(), 24);
        if (contentWidth < iOooO0O0) {
            contentWidth = iOooO0O0;
        }
        int right = (oooOo00.getRight() + oooOo00.getLeft()) / 2;
        int bottom = (oooOo00.getBottom() + oooOo00.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static OooO0OO OooO0oo(C0001o0 c0001o0) {
        return new OooO0OO(System.currentTimeMillis() + 3600000, new o0000Ooo(8, 10), new com.google.android.gms.internal.ads.o0O0OO0(true, false, false), 10.0d, 1.2d, 60);
    }

    public static o000O0Oo OooOO0(File file) {
        String str = o000O0Oo.f32579OooOo0o;
        String string = file.toString();
        OooOo.OooO0Oo(string, "toString()");
        return OooO(string, false);
    }

    @Override // o0ooOO0.o0000
    public WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, o0000O00 o0000o00) {
        o0000o00.f33104OooO0Oo = windowInsetsCompat.getSystemWindowInsetBottom() + o0000o00.f33104OooO0Oo;
        boolean z = ViewCompat.getLayoutDirection(view) == 1;
        int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
        int i = o0000o00.f33101OooO00o + (z ? systemWindowInsetRight : systemWindowInsetLeft);
        o0000o00.f33101OooO00o = i;
        int i2 = o0000o00.f33103OooO0OO;
        if (!z) {
            systemWindowInsetLeft = systemWindowInsetRight;
        }
        int i3 = i2 + systemWindowInsetLeft;
        o0000o00.f33103OooO0OO = i3;
        ViewCompat.setPaddingRelative(view, i, o0000o00.f33102OooO0O0, i3, o0000o00.f33104OooO0Oo);
        return windowInsetsCompat;
    }

    @Override // o0000Oo.o000oOoO
    public Object OooO0O0(String str, Provider provider) {
        switch (this.f14222OooOo0O) {
            case 11:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 12:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 13:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // o0000oo0.o00oO0o
    public /* synthetic */ Object OooO0OO(o000O0Oo.OooO0o oooO0o) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(oooO0o);
    }

    @Override // o000O0O0.OooO0o
    public OooO0OO OooO0Oo(C0001o0 c0001o0, JSONObject jSONObject) {
        return OooO0oo(c0001o0);
    }

    @Override // o000O0o0.OooOO0
    public StackTraceElement[] OooO0o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // o000OoO.OooOOOO
    public void OooO0o0(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public List OooOO0O(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (o00Oo0 o00oo0 : componentRegistrar.getComponents()) {
            String str = o00oo0.f29670OooO00o;
            if (str != null) {
                OooOo.OooOO0 oooOO0 = new OooOo.OooOO0(14, str, o00oo0);
                o00oo0 = new o00Oo0(str, o00oo0.f29671OooO0O0, o00oo0.f29672OooO0OO, o00oo0.f29673OooO0Oo, o00oo0.f29675OooO0o0, oooOO0, o00oo0.f29676OooO0oO);
            }
            arrayList.add(o00oo0);
        }
        return arrayList;
    }

    public void OooOO0o(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFOooO0oO = OooO0oO(tabLayout, view);
        RectF rectFOooO0oO2 = OooO0oO(tabLayout, view2);
        drawable.setBounds(Ooooo0o.oo0o0O0.OooO0OO(f, (int) rectFOooO0oO.left, (int) rectFOooO0oO2.left), drawable.getBounds().top, Ooooo0o.oo0o0O0.OooO0OO(f, (int) rectFOooO0oO.right, (int) rectFOooO0oO2.right), drawable.getBounds().bottom);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // OoooOOO.o00Oo00
    public Object zza() {
        switch (this.f14222OooOo0O) {
            case 0:
                List list = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool = (Boolean) C2328b.f26445OooO0o.OooO0O0();
                bool.getClass();
                return bool;
            case 1:
                List list2 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool2 = (Boolean) C2328b.f26441OooO00o.OooO0O0();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool3 = (Boolean) C2328b.f26447OooO0oO.OooO0O0();
                bool3.getClass();
                return bool3;
            case 3:
                List list4 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool4 = (Boolean) C2328b.f26446OooO0o0.OooO0O0();
                bool4.getClass();
                return bool4;
            case 4:
                List list5 = o0O000O.f14225OooO00o;
                Boolean bool5 = (Boolean) oOO0O00O.f26853OooO00o.OooO0O0();
                bool5.getClass();
                return bool5;
            case 5:
                List list6 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool6 = (Boolean) C2328b.f26444OooO0Oo.OooO0O0();
                bool6.getClass();
                return bool6;
            case 6:
                List list7 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.oOO0000.f26838o00Oo0.OooO0O0()).longValue());
            case 7:
                return new Boolean(((Boolean) oOOOoo00.f26870OooO00o.OooO0O0()).booleanValue());
            default:
                return new Boolean(((Boolean) C2334e.f26454OooO00o.OooO0O0()).booleanValue());
        }
    }

    public o0O00000(int[] iArr, ValueAnimator valueAnimator) {
        this.f14222OooOo0O = 26;
    }
}
