package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.p */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1149p extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1130n f1686a;

    /* renamed from: b */
    private C1220k f1687b;

    /* renamed from: c */
    private AbstractViewOnClickListenerC1152p2 f1688c;

    /* renamed from: com.applovin.impl.p$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ C1130n f1689e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C1130n c1130n) {
            super(context);
            this.f1689e = c1130n;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return this.f1689e.m1877g().size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            ArrayList arrayList = new ArrayList();
            C1140o c1140o = (C1140o) this.f1689e.m1877g().get(i);
            arrayList.add(AbstractActivityC1149p.this.m2038c(c1140o.m1926c()));
            if (c1140o.m1925b() != null) {
                arrayList.add(AbstractActivityC1149p.this.m2030a("AB Test Experiment Name", c1140o.m1925b()));
            }
            C1049h8 c1049h8M1927d = c1140o.m1927d();
            AbstractActivityC1149p abstractActivityC1149p = AbstractActivityC1149p.this;
            arrayList.add(abstractActivityC1149p.m2030a("Device ID Targeting", abstractActivityC1149p.m2032a(c1049h8M1927d.m955a())));
            AbstractActivityC1149p abstractActivityC1149p2 = AbstractActivityC1149p.this;
            arrayList.add(abstractActivityC1149p2.m2030a("Device Type Targeting", abstractActivityC1149p2.m2037b(c1049h8M1927d.m956b())));
            if (c1049h8M1927d.m957c() != null) {
                arrayList.add(AbstractActivityC1149p.this.m2031a(c1049h8M1927d.m957c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            C1140o c1140o = (C1140o) this.f1689e.m1877g().get(i);
            return (c1140o.m1925b() != null ? 1 : 0) + 3 + (c1140o.m1927d().m957c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return i == b.TARGETED_WATERFALL.ordinal() ? new C1250t4("TARGETED WATERFALL FOR CURRENT DEVICE") : i == b.OTHER_WATERFALLS.ordinal() ? new C1250t4("OTHER WATERFALLS") : new C1250t4("");
        }
    }

    /* renamed from: com.applovin.impl.p$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f1687b;
    }

    public void initialize(C1130n c1130n, C1220k c1220k) {
        this.f1686a = c1130n;
        this.f1687b = c1220k;
        a aVar = new a(this, c1130n);
        this.f1688c = aVar;
        aVar.m2059a(new OooOo.OooO(this, c1220k, c1130n, 5));
        this.f1688c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle(this.f1686a.m1874d());
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        listView.setAdapter((ListAdapter) this.f1688c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1152p2 abstractViewOnClickListenerC1152p2 = this.f1688c;
        if (abstractViewOnClickListenerC1152p2 != null) {
            abstractViewOnClickListenerC1152p2.m2059a((AbstractViewOnClickListenerC1152p2.a) null);
        }
    }

    /* renamed from: b */
    public String m2037b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* renamed from: c */
    public C1143o2 m2038c(String str) {
        return C1143o2.m1979a(C1143o2.c.RIGHT_DETAIL).m1997b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).m1991a(this).m1994a(true).m1995a();
    }

    /* renamed from: a */
    public /* synthetic */ void m2035a(final C1220k c1220k, final C1130n c1130n, final C1053i2 c1053i2, C1143o2 c1143o2) {
        if (c1053i2.m968a() == 0) {
            final int i = 0;
            AbstractC1000d.m506a(this, MaxDebuggerAdUnitDetailActivity.class, c1220k.m2893e(), new AbstractC1000d.b() { // from class: com.applovin.impl.o00000OO
                @Override // com.applovin.impl.AbstractC1000d.b
                /* renamed from: a */
                public final void mo327a(Activity activity) {
                    switch (i) {
                        case 0:
                            C1053i2 c1053i22 = c1053i2;
                            AbstractActivityC1149p.m2033a(c1130n, c1053i22, c1220k, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            C1053i2 c1053i23 = c1053i2;
                            AbstractActivityC1149p.m2034a(c1130n, c1053i23, c1220k, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            AbstractC1000d.m506a(this, MaxDebuggerWaterfallSegmentsActivity.class, c1220k.m2893e(), new AbstractC1000d.b() { // from class: com.applovin.impl.o00000OO
                @Override // com.applovin.impl.AbstractC1000d.b
                /* renamed from: a */
                public final void mo327a(Activity activity) {
                    switch (i2) {
                        case 0:
                            C1053i2 c1053i22 = c1053i2;
                            AbstractActivityC1149p.m2033a(c1130n, c1053i22, c1220k, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            C1053i2 c1053i23 = c1053i2;
                            AbstractActivityC1149p.m2034a(c1130n, c1053i23, c1220k, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2033a(C1130n c1130n, C1053i2 c1053i2, C1220k c1220k, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1130n, (C1140o) c1130n.m1877g().get(c1053i2.m969b()), null, c1220k);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2034a(C1130n c1130n, C1053i2 c1053i2, C1220k c1220k, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C1140o c1140o = (C1140o) c1130n.m1877g().get(c1053i2.m969b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c1140o.m1926c(), c1140o.m1927d().m957c(), c1220k);
    }

    /* renamed from: a */
    public C1143o2 m2030a(String str, String str2) {
        return C1143o2.m1979a(C1143o2.c.RIGHT_DETAIL).m2003d(str).m2001c(str2).m1995a();
    }

    /* renamed from: a */
    public C1143o2 m2031a(List list) {
        return C1143o2.m1979a(C1143o2.c.DETAIL).m2003d("Segment Targeting").m1992a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).m1991a(this).m1994a(true).m1995a();
    }

    /* renamed from: a */
    public String m2032a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
