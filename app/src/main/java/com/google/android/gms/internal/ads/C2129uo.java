package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uo */
/* loaded from: classes2.dex */
public final class C2129uo extends FrameLayout implements InterfaceC1722jo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicBoolean f24670OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2166vo f24671OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2051sk f24672OooOo0o;

    public C2129uo(ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo) {
        super(viewTreeObserverOnGlobalLayoutListenerC2166vo.getContext());
        this.f24670OooOo = new AtomicBoolean();
        this.f24671OooOo0O = viewTreeObserverOnGlobalLayoutListenerC2166vo;
        this.f24672OooOo0o = new C2051sk(viewTreeObserverOnGlobalLayoutListenerC2166vo.f25027OooOo0O.f18641OooO0OO, this, this);
        addView(viewTreeObserverOnGlobalLayoutListenerC2166vo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooO(int i) {
        C1831mm c1831mm = (C1831mm) this.f24672OooOo0o.f24099OooOoO;
        if (c1831mm != null) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17752OoooO0O)).booleanValue()) {
                c1831mm.f21285OooOo0o.setBackgroundColor(i);
                c1831mm.f21283OooOo.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooO00o(String str, String str2) {
        this.f24671OooOo0O.OooO00o("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooO0O0() {
        this.f24671OooOo0O.OooO0O0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final kd0 OooO0OO() {
        return this.f24671OooOo0O.f25035OooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C1663i1 OooO0Oo() {
        return this.f24671OooOo0O.f25028OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final void OooO0o(String str, Map map) {
        this.f24671OooOo0O.OooO0o(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final void OooO0o0(String str, JSONObject jSONObject) {
        this.f24671OooOo0O.OooO0o0(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final View OooO0oO() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOO0O(int i, boolean z, boolean z2) {
        this.f24671OooOo0O.OooOO0O(i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOO0o(int i) {
        this.f24671OooOo0O.OooOO0o(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooOOO(String str, JSONObject jSONObject) {
        this.f24671OooOo0O.OooO00o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean OooOOO0() {
        return this.f24671OooOo0O.OooOOO0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOOOO(boolean z) {
        this.f24671OooOo0O.f25037Oooo0.f21554OoooOo0 = z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final e60 OooOOOo() {
        return this.f24671OooOo0O.OooOOOo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final WebView OooOOo() {
        return this.f24671OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOOo0(kd0 kd0Var, md0 md0Var) {
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        viewTreeObserverOnGlobalLayoutListenerC2166vo.f25035OooOooo = kd0Var;
        viewTreeObserverOnGlobalLayoutListenerC2166vo.f25038Oooo000 = md0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean OooOOoo() {
        return this.f24671OooOo0O.OooOOoo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final ArrayList OooOo() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f24671OooOo0O) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean OooOo0() {
        return this.f24671OooOo0O.OooOo0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOo00() {
        f60 f60VarO00oO0O;
        e60 e60VarOooOOOo;
        TextView textView = new TextView(getContext());
        zzv.zzq();
        textView.setText(zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue();
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        if (zBooleanValue && (e60VarOooOOOo = viewTreeObserverOnGlobalLayoutListenerC2166vo.OooOOOo()) != null) {
            e60VarOooOOOo.OooO00o(textView);
            return;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0ooo)).booleanValue() || (f60VarO00oO0O = viewTreeObserverOnGlobalLayoutListenerC2166vo.o00oO0O()) == null) {
            return;
        }
        if (((xg0) f60VarO00oO0O.f18792OooO0O0.f22434OooOoo0) == xg0.HTML) {
            C1658hx c1658hx = (C1658hx) zzv.zzB();
            yg0 yg0Var = f60VarO00oO0O.f18791OooO00o;
            c1658hx.getClass();
            C1658hx.OooOOOo(new z50(yg0Var, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOo0O() {
        this.f24671OooOo0O.f25070o00oO0o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final String OooOo0o() {
        return this.f24671OooOo0O.OooOo0o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoO(BinderC2240xo binderC2240xo) {
        this.f24671OooOo0O.OooOoO(binderC2240xo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoO0(zzm zzmVar) {
        this.f24671OooOo0O.OooOoO0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoOO() {
        this.f24671OooOo0O.OooOoOO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoo(String str, InterfaceC2042sb interfaceC2042sb) {
        this.f24671OooOo0O.OooOoo(str, interfaceC2042sb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoo0(String str, String str2) throws Throwable {
        this.f24671OooOo0O.OooOoo0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOooO(boolean z) {
        this.f24671OooOo0O.OooOooO(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final InterfaceC2034s3 OooOooo() {
        return this.f24671OooOo0O.OooOooo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean Oooo() {
        return this.f24671OooOo0O.Oooo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0(e60 e60Var) {
        this.f24671OooOo0O.Oooo0(e60Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        if (viewTreeObserverOnGlobalLayoutListenerC2166vo != null) {
            viewTreeObserverOnGlobalLayoutListenerC2166vo.Oooo000();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo00O(InterfaceC1377a9 interfaceC1377a9) {
        this.f24671OooOo0O.Oooo00O(interfaceC1377a9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo00o() {
        setBackgroundColor(0);
        this.f24671OooOo0O.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0O0(long j, boolean z) {
        this.f24671OooOo0O.Oooo0O0(j, z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0OO(String str, InterfaceC2042sb interfaceC2042sb) {
        this.f24671OooOo0O.Oooo0OO(str, interfaceC2042sb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0o(boolean z) {
        this.f24671OooOo0O.Oooo0o(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean Oooo0o0() {
        return this.f24670OooOo.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0oo(f60 f60Var) {
        this.f24671OooOo0O.Oooo0oo(f60Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooO(boolean z) {
        this.f24671OooOo0O.OoooO(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOO0(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f24671OooOo0O.OoooOO0(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOoO(boolean z, int i, String str, String str2, boolean z2) {
        this.f24671OooOo0O.OoooOoO(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOoo(int i) {
        this.f24671OooOo0O.OoooOoo(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        this.f24671OooOo0O.Ooooo00(c1444c3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Ooooo0o(String str, C1847n1 c1847n1) {
        this.f24671OooOo0O.Ooooo0o(str, c1847n1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooooO0(InterfaceC2034s3 interfaceC2034s3) {
        this.f24671OooOo0O.OooooO0(interfaceC2034s3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooooOO(String str, String str2) {
        this.f24671OooOo0O.OooooOO(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooooOo() {
        this.f24671OooOo0O.OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooooo(l00 l00Var) {
        this.f24671OooOo0O.Oooooo(l00Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final xd0 OoooooO() {
        return this.f24671OooOo0O.f25026OooOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean Ooooooo() {
        return this.f24671OooOo0O.Ooooooo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean canGoBack() {
        return this.f24671OooOo0O.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void destroy() {
        e60 e60VarOooOOOo;
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        f60 f60VarO00oO0O = viewTreeObserverOnGlobalLayoutListenerC2166vo.o00oO0O();
        if (f60VarO00oO0O != null) {
            pj0 pj0Var = zzs.zza;
            pj0Var.post(new RunnableC1442c1(f60VarO00oO0O, 18));
            pj0Var.postDelayed(new RunnableC2092to(viewTreeObserverOnGlobalLayoutListenerC2166vo, 0), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo)).intValue());
        } else if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() || (e60VarOooOOOo = viewTreeObserverOnGlobalLayoutListenerC2166vo.OooOOOo()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC2166vo.destroy();
        } else {
            zzs.zza.post(new wp0(14, this, e60VarOooOOOo));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void goBack() {
        this.f24671OooOo0O.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void loadData(String str, String str2, String str3) {
        this.f24671OooOo0O.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.f24671OooOo0O.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void loadUrl(String str) {
        this.f24671OooOo0O.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o000oOoO(Context context) {
        this.f24671OooOo0O.o000oOoO(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o00O0O(boolean z) {
        this.f24671OooOo0O.o00O0O(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final o00000oO.OooOOO o00Oo0() {
        return this.f24671OooOo0O.o00Oo0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o00Ooo(String str, AbstractC1869nn abstractC1869nn) {
        this.f24671OooOo0O.o00Ooo(str, abstractC1869nn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final f60 o00oO0O() {
        return this.f24671OooOo0O.o00oO0O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o00oO0o(zzm zzmVar) {
        this.f24671OooOo0O.o00oO0o(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o00ooo(zzc zzcVar, boolean z, boolean z2, String str) {
        this.f24671OooOo0O.o00ooo(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o0OoOo0(Oooo0oO.o0O0O00 o0o0o00) {
        this.f24671OooOo0O.o0OoOo0(o0o0o00);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o0ooOO0() {
        this.f24671OooOo0O.o0ooOO0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o0ooOOo(boolean z) {
        this.f24671OooOo0O.o0ooOOo(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final md0 o0ooOoO() {
        return this.f24671OooOo0O.f25038Oooo000;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        if (viewTreeObserverOnGlobalLayoutListenerC2166vo != null) {
            viewTreeObserverOnGlobalLayoutListenerC2166vo.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void onPause() {
        AbstractC1684im abstractC1684im;
        C2051sk c2051sk = this.f24672OooOo0o;
        c2051sk.getClass();
        Oooo00O.o000000O.OooO0Oo("onPause must be called from the UI thread.");
        C1831mm c1831mm = (C1831mm) c2051sk.f24099OooOoO;
        if (c1831mm != null && (abstractC1684im = c1831mm.f21290OooOoo0) != null) {
            abstractC1684im.OooOOo();
        }
        this.f24671OooOo0O.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void onResume() {
        this.f24671OooOo0O.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void ooOO() {
        this.f24671OooOo0O.ooOO();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f24671OooOo0O.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f24671OooOo0O.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f24671OooOo0O.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f24671OooOo0O.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzA(int i) {
        this.f24671OooOo0O.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final Context zzE() {
        return this.f24671OooOo0O.f25027OooOo0O.f18641OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final InterfaceC1377a9 zzK() {
        return this.f24671OooOo0O.zzK();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final zzm zzL() {
        return this.f24671OooOo0O.zzL();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final zzm zzM() {
        return this.f24671OooOo0O.zzM();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final AbstractC1870no zzN() {
        return this.f24671OooOo0O.f25037Oooo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final Oooo0oO.o0O0O00 zzO() {
        return this.f24671OooOo0O.zzO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzX() {
        C2051sk c2051sk = this.f24672OooOo0o;
        c2051sk.getClass();
        Oooo00O.o000000O.OooO0Oo("onDestroy must be called from the UI thread.");
        C1831mm c1831mm = (C1831mm) c2051sk.f24099OooOoO;
        if (c1831mm != null) {
            c1831mm.f21286OooOoO.OooO00o();
            AbstractC1684im abstractC1684im = c1831mm.f21290OooOoo0;
            if (abstractC1684im != null) {
                abstractC1684im.OooOo0o();
            }
            c1831mm.OooO0O0();
            ((C2129uo) c2051sk.f24100OooOoO0).removeView((C1831mm) c2051sk.f24099OooOoO);
            c2051sk.f24099OooOoO = null;
        }
        this.f24671OooOo0O.zzX();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzY() {
        this.f24671OooOo0O.zzY();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void zza(String str) {
        this.f24671OooOo0O.OoooO00(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzaa() {
        this.f24671OooOo0O.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.f24671OooOo0O.zzde();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.f24671OooOo0O.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final int zzf() {
        return this.f24671OooOo0O.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final int zzg() {
        return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Oo0oO)).booleanValue() ? this.f24671OooOo0O.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final int zzh() {
        return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Oo0oO)).booleanValue() ? this.f24671OooOo0O.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final Activity zzi() {
        return this.f24671OooOo0O.f25027OooOo0O.f18639OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final zza zzj() {
        return this.f24671OooOo0O.f25033OooOoo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C1558f7 zzk() {
        return this.f24671OooOo0O.f25060OooooOO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C2249xx zzm() {
        return this.f24671OooOo0O.f25063Oooooo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final VersionInfoParcel zzn() {
        return this.f24671OooOo0O.f25029OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C2051sk zzo() {
        return this.f24672OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final BinderC2240xo zzq() {
        return this.f24671OooOo0O.zzq();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final String zzr() {
        return this.f24671OooOo0O.zzr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = this.f24671OooOo0O;
        if (viewTreeObserverOnGlobalLayoutListenerC2166vo != null) {
            viewTreeObserverOnGlobalLayoutListenerC2166vo.zzu();
        }
    }
}
