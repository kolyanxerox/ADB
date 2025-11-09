package com.ironsource.sdk.controller;

import OooO0oO.OooOo;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3045dk;
import com.ironsource.C3198hs;
import com.ironsource.C3256jh;
import com.ironsource.C3273k;
import com.ironsource.C3308l;
import com.ironsource.C3489oh;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3699th;
import com.ironsource.C3722u5;
import com.ironsource.C3750ux;
import com.ironsource.C3856y2;
import com.ironsource.InterfaceC3742up;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.InterfaceC3818ww;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C3657v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes2.dex */
public class ControllerActivity extends Activity implements InterfaceC3742up, InterfaceC3818ww {

    /* renamed from: n */
    private static final String f11361n = "ControllerActivity";

    /* renamed from: o */
    private static final int f11362o = 1;

    /* renamed from: p */
    private static String f11363p = "removeWebViewContainerView | mContainer is null";

    /* renamed from: q */
    private static String f11364q = "removeWebViewContainerView | view is null";

    /* renamed from: a */
    private String f11365a;

    /* renamed from: b */
    private C3657v f11366b;

    /* renamed from: c */
    private RelativeLayout f11367c;

    /* renamed from: d */
    private FrameLayout f11368d;

    /* renamed from: e */
    private InterfaceC3767vf f11369e;

    /* renamed from: g */
    private String f11371g;

    /* renamed from: k */
    private C3856y2 f11375k;

    /* renamed from: l */
    private boolean f11376l;

    /* renamed from: m */
    private boolean f11377m;
    public int currentRequestedRotation = -1;

    /* renamed from: f */
    private boolean f11370f = false;

    /* renamed from: h */
    private Handler f11372h = new Handler();

    /* renamed from: i */
    private final Runnable f11373i = new RunnableC3626a();

    /* renamed from: j */
    final RelativeLayout.LayoutParams f11374j = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$a */
    public class RunnableC3626a implements Runnable {
        public RunnableC3626a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f11370f));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$b */
    public class ViewOnSystemUiVisibilityChangeListenerC3627b implements View.OnSystemUiVisibilityChangeListener {
        public ViewOnSystemUiVisibilityChangeListenerC3627b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity.this.f11372h.removeCallbacks(ControllerActivity.this.f11373i);
                ControllerActivity.this.f11372h.postDelayed(ControllerActivity.this.f11373i, 500L);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$c */
    public class RunnableC3628c implements Runnable {
        public RunnableC3628c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$d */
    public class RunnableC3629d implements Runnable {
        public RunnableC3629d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    /* renamed from: a */
    private View m11892a(ViewGroup viewGroup) {
        return m11902d() ? viewGroup.findViewById(1) : C3256jh.m9487a().mo9491a(this.f11365a).getPresentingView();
    }

    /* renamed from: d */
    private boolean m11902d() {
        return this.f11365a == null;
    }

    /* renamed from: e */
    private void m11903e() {
        runOnUiThread(new RunnableC3628c());
    }

    /* renamed from: f */
    private void m11904f() throws Exception {
        ViewGroup viewGroup;
        try {
            if (this.f11367c == null) {
                throw new Exception(f11363p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f11368d.getParent();
            View viewM11892a = m11892a(viewGroup2);
            if (viewM11892a == null) {
                throw new Exception(f11364q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewM11892a.getParent()) != null) {
                viewGroup.removeView(viewM11892a);
            }
            viewGroup2.removeView(this.f11368d);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            C3699th.m12428a(C3198hs.f8934s, new C3489oh().m11155a(C3037dc.f8225A, e.getMessage()).m11156a());
            Logger.m12266i(f11361n, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    /* renamed from: g */
    private void m11905g() {
        int iMo4831L = this.f11369e.mo4831L(this);
        String str = f11361n;
        Logger.m12266i(str, "setInitiateLandscapeOrientation");
        if (iMo4831L == 0) {
            Logger.m12266i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iMo4831L == 2) {
            Logger.m12266i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iMo4831L == 3) {
            Logger.m12266i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iMo4831L != 1) {
            Logger.m12266i(str, "No Rotation");
        } else {
            Logger.m12266i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* renamed from: h */
    private void m11906h() {
        int iMo4831L = this.f11369e.mo4831L(this);
        String str = f11361n;
        Logger.m12266i(str, "setInitiatePortraitOrientation");
        if (iMo4831L == 0) {
            Logger.m12266i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iMo4831L == 2) {
            Logger.m12266i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iMo4831L == 1) {
            Logger.m12266i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iMo4831L != 3) {
            Logger.m12266i(str, "No Rotation");
        } else {
            Logger.m12266i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.InterfaceC3742up
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.m12266i(f11361n, "onBackPressed");
        if (C3722u5.m12540a().m12541a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.InterfaceC3742up
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11369e = C3495on.m11199U().mo8686f();
        try {
            new C3308l(this).mo8057a();
            new C3273k(this).mo8057a();
            C3657v c3657v = (C3657v) C3045dk.m8333b((Context) this).mo8343a().m12006j();
            this.f11366b = c3657v;
            c3657v.m12226s().setId(1);
            this.f11366b.m12204a((InterfaceC3742up) this);
            this.f11366b.m12205a((InterfaceC3818ww) this);
            Intent intent = getIntent();
            this.f11371g = intent.getStringExtra(C3034d9.h.f8117m);
            this.f11370f = intent.getBooleanExtra(C3034d9.h.f8135v, false);
            this.f11365a = intent.getStringExtra("adViewId");
            this.f11376l = false;
            this.f11377m = intent.getBooleanExtra(C3034d9.h.f8144z0, false);
            if (this.f11370f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC3627b());
                runOnUiThread(this.f11373i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f11367c = relativeLayout;
            setContentView(relativeLayout, this.f11374j);
            this.f11368d = m11893a(this.f11365a);
            if (this.f11367c.findViewById(1) == null && this.f11368d.getParent() != null) {
                finish();
            }
            m11901c();
            this.f11367c.addView(this.f11368d, this.f11374j);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() throws Exception {
        super.onDestroy();
        String str = f11361n;
        Logger.m12266i(str, "onDestroy");
        m11904f();
        if (this.f11376l) {
            return;
        }
        Logger.m12266i(str, "onDestroy | destroyedFromBackground");
        m11898b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f11366b.m12232y()) {
            this.f11366b.m12231x();
            return true;
        }
        if (this.f11370f && (i == 25 || i == 24)) {
            this.f11372h.removeCallbacks(this.f11373i);
            this.f11372h.postDelayed(this.f11373i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.InterfaceC3742up
    public void onOrientationChanged(String str, int i) {
        m11895a(str, i);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.m12266i(f11361n, "onPause, isFinishing=" + isFinishing());
        C3655t.m12069a(this);
        C3657v c3657v = this.f11366b;
        if (c3657v != null) {
            c3657v.mo11982a((Context) this);
            if (!this.f11377m) {
                this.f11366b.m12187B();
            }
            this.f11366b.m12208a(false, C3034d9.h.f8093Z);
            this.f11366b.m12218g(this.f11371g, C3034d9.h.f8132t0);
        }
        if (isFinishing()) {
            this.f11376l = true;
            m11898b();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.m12266i(f11361n, C3034d9.h.f8134u0);
        C3657v c3657v = this.f11366b;
        if (c3657v != null) {
            c3657v.mo11998b(this);
            if (!this.f11377m) {
                this.f11366b.m12191F();
            }
            this.f11366b.m12208a(true, C3034d9.h.f8093Z);
            this.f11366b.m12218g(this.f11371g, C3034d9.h.f8134u0);
        }
        C3655t.m12071b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.m12266i(f11361n, "onStart");
        C3657v c3657v = this.f11366b;
        if (c3657v != null) {
            c3657v.m12218g(this.f11371g, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.m12266i(f11361n, "onStop");
        C3657v c3657v = this.f11366b;
        if (c3657v != null) {
            c3657v.m12218g(this.f11371g, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m12266i(f11361n, "onUserLeaveHint");
        C3657v c3657v = this.f11366b;
        if (c3657v != null) {
            c3657v.m12218g(this.f11371g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC3818ww
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3818ww
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3818ww
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3818ww
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3818ww
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f11370f && z) {
            runOnUiThread(this.f11373i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f11361n;
            StringBuilder sbOooOOo0 = OooOo.OooOOo0(i, "Rotation: Req = ", " Curr = ");
            sbOooOOo0.append(this.currentRequestedRotation);
            Logger.m12266i(str, sbOooOOo0.toString());
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            m11903e();
        } else {
            m11894a();
        }
    }

    /* renamed from: a */
    private FrameLayout m11893a(String str) {
        return !m11899b(str) ? this.f11366b.m12226s() : C3750ux.m12725a(getApplicationContext(), C3256jh.m9487a().mo9491a(str).getPresentingView());
    }

    /* renamed from: b */
    private void m11898b() {
        String str = f11361n;
        Logger.m12266i(str, "clearWebviewController");
        C3657v c3657v = this.f11366b;
        if (c3657v == null) {
            Logger.m12266i(str, "clearWebviewController, null");
            return;
        }
        c3657v.m12203a(C3657v.u.Gone);
        this.f11366b.m12188C();
        this.f11366b.m12189D();
        this.f11366b.m12218g(this.f11371g, "onDestroy");
    }

    /* renamed from: c */
    private void m11901c() {
        Intent intent = getIntent();
        m11895a(intent.getStringExtra(C3034d9.h.f8056A), intent.getIntExtra(C3034d9.h.f8058B, 0));
    }

    /* renamed from: a */
    private void m11894a() {
        runOnUiThread(new RunnableC3629d());
    }

    /* renamed from: b */
    private boolean m11899b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* renamed from: a */
    private void m11895a(String str, int i) {
        int i2;
        if (str != null) {
            if (C3034d9.h.f8060C.equalsIgnoreCase(str)) {
                m11905g();
                return;
            }
            if (C3034d9.h.f8062D.equalsIgnoreCase(str)) {
                m11906h();
                return;
            }
            if (C3034d9.h.f8068G.equalsIgnoreCase(str)) {
                if (!this.f11369e.mo4824E(this)) {
                    return;
                } else {
                    i2 = 1;
                }
            } else if (getRequestedOrientation() != -1) {
                return;
            } else {
                i2 = 4;
            }
            setRequestedOrientation(i2);
        }
    }
}
