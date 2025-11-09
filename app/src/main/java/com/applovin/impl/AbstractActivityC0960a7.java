package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.a7 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0960a7 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f191a;

    /* renamed from: b */
    private List f192b;

    /* renamed from: c */
    private List f193c;

    /* renamed from: d */
    private AbstractViewOnClickListenerC1152p2 f194d;

    /* renamed from: e */
    private List f195e;

    /* renamed from: f */
    private List f196f;

    /* renamed from: g */
    private ListView f197g;

    /* renamed from: com.applovin.impl.a7$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: a */
        public C1143o2 mo130a() {
            return new C1143o2.b(C1143o2.c.SECTION_CENTERED).m2003d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m1995a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return i == c.BIDDERS.ordinal() ? AbstractActivityC0960a7.this.f195e : AbstractActivityC0960a7.this.f196f;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return i == c.BIDDERS.ordinal() ? AbstractActivityC0960a7.this.f195e.size() : AbstractActivityC0960a7.this.f196f.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return i == c.BIDDERS.ordinal() ? new C1250t4("BIDDERS") : new C1250t4("WATERFALL");
        }
    }

    /* renamed from: com.applovin.impl.a7$b */
    public class b extends C1276w3 {

        /* renamed from: p */
        final /* synthetic */ C1177r2 f199p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0984b3 c0984b3, Context context, C1177r2 c1177r2) {
            super(c0984b3, context);
            this.f199p = c1177r2;
        }

        @Override // com.applovin.impl.C1276w3, com.applovin.impl.C1143o2
        /* renamed from: d */
        public int mo135d() {
            if (AbstractActivityC0960a7.this.f191a.m2922t0().m492b() == null || !AbstractActivityC0960a7.this.f191a.m2922t0().m492b().equals(this.f199p.m2311b())) {
                return 0;
            }
            return C1333R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.C1276w3, com.applovin.impl.C1143o2
        /* renamed from: e */
        public int mo136e() {
            if (AbstractActivityC0960a7.this.f191a.m2922t0().m492b() == null || !AbstractActivityC0960a7.this.f191a.m2922t0().m492b().equals(this.f199p.m2311b())) {
                return super.mo136e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.C1143o2
        /* renamed from: k */
        public SpannedString mo137k() {
            return StringUtils.createSpannedString(this.f199p.m2310a(), mo1440o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    /* renamed from: com.applovin.impl.a7$c */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public AbstractActivityC0960a7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f191a;
    }

    public void initialize(List<C1177r2> list, List<C1177r2> list2, C1220k c1220k) {
        this.f191a = c1220k;
        this.f192b = list;
        this.f193c = list2;
        this.f195e = m126a(list);
        this.f196f = m126a(list2);
        a aVar = new a(this);
        this.f194d = aVar;
        aVar.m2059a(new OooO0OO(this, c1220k));
        this.f194d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C1333R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        this.f197g = listView;
        listView.setAdapter((ListAdapter) this.f194d);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f195e = m126a(this.f192b);
        this.f196f = m126a(this.f193c);
        this.f194d.m2061c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m127a(C1220k c1220k, C1053i2 c1053i2, C1143o2 c1143o2) {
        List listM2311b = m124a(c1053i2).m2311b();
        if (listM2311b.equals(c1220k.m2922t0().m492b())) {
            c1220k.m2922t0().m490a((List) null);
        } else {
            c1220k.m2922t0().m490a(listM2311b);
        }
        this.f194d.notifyDataSetChanged();
    }

    /* renamed from: a */
    private List m126a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1177r2 c1177r2 = (C1177r2) it.next();
            arrayList.add(new b(c1177r2.m2313d(), this, c1177r2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C1177r2 m124a(C1053i2 c1053i2) {
        if (c1053i2.m969b() == c.BIDDERS.ordinal()) {
            return (C1177r2) this.f192b.get(c1053i2.m968a());
        }
        return (C1177r2) this.f193c.get(c1053i2.m968a());
    }
}
