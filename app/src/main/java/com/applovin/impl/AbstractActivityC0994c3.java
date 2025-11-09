package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C1004d3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.c3 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0994c3 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1004d3 f563a;

    /* renamed from: b */
    private ListView f564b;

    /* renamed from: com.applovin.impl.c3$a */
    public class a implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ C0984b3 f565a;

        /* renamed from: com.applovin.impl.c3$a$a, reason: collision with other inner class name */
        public class C4550a implements AbstractC1000d.b {
            public C4550a() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f565a);
            }
        }

        public a(C0984b3 c0984b3) {
            this.f565a = c0984b3;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            if (c1053i2.m969b() != C1004d3.a.TEST_ADS.ordinal()) {
                AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC0994c3.this);
                return;
            }
            C1220k c1220kM363o = this.f565a.m363o();
            C0984b3.b bVarM373y = this.f565a.m373y();
            if (!AbstractActivityC0994c3.this.f563a.m593a(c1053i2)) {
                AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC0994c3.this);
                return;
            }
            if (C0984b3.b.READY == bVarM373y) {
                AbstractC1000d.m506a(AbstractActivityC0994c3.this, MaxDebuggerMultiAdActivity.class, c1220kM363o.m2893e(), new C4550a());
            } else if (C0984b3.b.DISABLED != bVarM373y) {
                AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC0994c3.this);
            } else {
                c1220kM363o.m2922t0().m488a();
                AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC0994c3.this);
            }
        }
    }

    public AbstractActivityC0994c3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        C1004d3 c1004d3 = this.f563a;
        if (c1004d3 != null) {
            return c1004d3.m594h().m363o();
        }
        return null;
    }

    public void initialize(C0984b3 c0984b3) {
        setTitle(c0984b3.m355g());
        C1004d3 c1004d3 = new C1004d3(c0984b3, this);
        this.f563a = c1004d3;
        c1004d3.m2059a(new a(c0984b3));
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        this.f564b = listView;
        listView.setAdapter((ListAdapter) this.f563a);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f563a.m594h().m350b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f563a.m595k();
            this.f563a.m2061c();
        }
    }
}
