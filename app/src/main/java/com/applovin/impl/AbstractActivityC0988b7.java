package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.b7 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0988b7 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f434a;

    /* renamed from: b */
    private List f435b;

    /* renamed from: c */
    private AbstractViewOnClickListenerC1152p2 f436c;

    /* renamed from: d */
    private List f437d;

    /* renamed from: e */
    private ListView f438e;

    /* renamed from: com.applovin.impl.b7$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ List f439e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f439e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: a */
        public C1143o2 mo130a() {
            return new C1143o2.b(C1143o2.c.SECTION_CENTERED).m2003d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m1995a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return AbstractActivityC0988b7.this.f437d;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return this.f439e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return new C1250t4("TEST MODE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.b7$b */
    public class b implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ List f441a;

        /* renamed from: b */
        final /* synthetic */ C1220k f442b;

        public b(List list, C1220k c1220k) {
            this.f441a = list;
            this.f442b = c1220k;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            List listM369u = ((C0984b3) this.f441a.get(c1053i2.m968a())).m369u();
            if (listM369u.equals(this.f442b.m2922t0().m492b())) {
                this.f442b.m2922t0().m490a((List) null);
            } else {
                this.f442b.m2922t0().m490a(listM369u);
            }
            AbstractActivityC0988b7.this.f436c.notifyDataSetChanged();
        }
    }

    /* renamed from: com.applovin.impl.b7$c */
    public class c extends C1276w3 {

        /* renamed from: p */
        final /* synthetic */ C0984b3 f444p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0984b3 c0984b3, Context context, C0984b3 c0984b32) {
            super(c0984b3, context);
            this.f444p = c0984b32;
        }

        @Override // com.applovin.impl.C1276w3, com.applovin.impl.C1143o2
        /* renamed from: d */
        public int mo135d() {
            if (this.f444p.m369u().equals(AbstractActivityC0988b7.this.f434a.m2922t0().m492b())) {
                return C1333R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.C1276w3, com.applovin.impl.C1143o2
        /* renamed from: e */
        public int mo136e() {
            if (this.f444p.m369u().equals(AbstractActivityC0988b7.this.f434a.m2922t0().m492b())) {
                return -16776961;
            }
            return super.mo136e();
        }

        @Override // com.applovin.impl.C1143o2
        /* renamed from: k */
        public SpannedString mo137k() {
            return StringUtils.createSpannedString(this.f444p.m355g(), mo1440o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    public AbstractActivityC0988b7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f434a;
    }

    public void initialize(List<C0984b3> list, C1220k c1220k) {
        this.f434a = c1220k;
        this.f435b = list;
        this.f437d = m420a(list);
        a aVar = new a(this, list);
        this.f436c = aVar;
        aVar.m2059a(new b(list, c1220k));
        this.f436c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(C1333R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        this.f438e = listView;
        listView.setAdapter((ListAdapter) this.f436c);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f437d = m420a(this.f435b);
        this.f436c.notifyDataSetChanged();
    }

    /* renamed from: a */
    private List m420a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0984b3 c0984b3 = (C0984b3) it.next();
            arrayList.add(new c(c0984b3, this, c0984b3));
        }
        return arrayList;
    }
}
