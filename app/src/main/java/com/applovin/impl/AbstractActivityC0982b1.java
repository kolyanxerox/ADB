package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C0992c1;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.b1 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0982b1 extends Activity {

    /* renamed from: a */
    private C0992c1 f338a;

    /* renamed from: b */
    private FrameLayout f339b;

    /* renamed from: c */
    private ListView f340c;

    /* renamed from: com.applovin.impl.b1$a */
    public class a implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ C0990c f341a;

        /* renamed from: com.applovin.impl.b1$a$a, reason: collision with other inner class name */
        public class C4549a implements AbstractC1000d.b {

            /* renamed from: a */
            final /* synthetic */ C1053i2 f343a;

            public C4549a(C1053i2 c1053i2) {
                this.f343a = c1053i2;
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.m1885a((C1151p1) AbstractActivityC0982b1.this.f338a.m445d().get(this.f343a.m968a()), AbstractActivityC0982b1.this.f338a.m446e());
            }
        }

        public a(C0990c c0990c) {
            this.f341a = c0990c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            if (c1053i2.m969b() != C0992c1.a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC1000d.m506a(AbstractActivityC0982b1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f341a, new C4549a(c1053i2));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(C1333R.layout.mediation_debugger_list_view);
        this.f339b = (FrameLayout) findViewById(R.id.content);
        this.f340c = (ListView) findViewById(C1333R.id.listView);
        AbstractC0989b8.m427a(this.f339b, C1220k.f2089D0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C0992c1 c0992c1 = this.f338a;
        if (c0992c1 != null) {
            c0992c1.m2059a((AbstractViewOnClickListenerC1152p2.a) null);
            this.f338a.m448g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C0992c1 c0992c1 = this.f338a;
        if (c0992c1 == null) {
            finish();
            return;
        }
        this.f340c.setAdapter((ListAdapter) c0992c1);
        C0992c1 c0992c12 = this.f338a;
        if (c0992c12 != null && !c0992c12.m446e().m2933z().m552g()) {
            m325a(C1333R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        C0992c1 c0992c13 = this.f338a;
        if (c0992c13 == null || !c0992c13.m447f()) {
            return;
        }
        m325a(C1333R.string.applovin_creative_debugger_no_ads_text);
    }

    /* renamed from: a */
    public void m326a(C0992c1 c0992c1, C0990c c0990c) {
        this.f338a = c0992c1;
        c0992c1.m2059a(new a(c0990c));
    }

    /* renamed from: a */
    private void m325a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f339b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f339b.bringChildToFront(textView);
    }
}
