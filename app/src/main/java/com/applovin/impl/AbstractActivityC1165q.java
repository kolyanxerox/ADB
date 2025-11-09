package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.q */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1165q extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f1763a;

    /* renamed from: b */
    private AbstractViewOnClickListenerC1152p2 f1764b;

    /* renamed from: c */
    private List f1765c;

    /* renamed from: d */
    private boolean f1766d;

    /* renamed from: e */
    private ListView f1767e;

    /* renamed from: com.applovin.impl.q$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ List f1768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f1768e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return AbstractActivityC1165q.this.f1765c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return this.f1768e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return new C1250t4("");
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f1763a;
    }

    public void initialize(List<C1130n> list, boolean z, C1220k c1220k) {
        this.f1766d = z;
        this.f1763a = c1220k;
        this.f1765c = m2119a(list);
        a aVar = new a(this, list);
        this.f1764b = aVar;
        aVar.m2059a(new OooOo.OooO(this, list, c1220k, 8));
        this.f1764b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f1766d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(C1333R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        this.f1767e = listView;
        listView.setAdapter((ListAdapter) this.f1764b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m2122a(List list, final C1220k c1220k, C1053i2 c1053i2, C1143o2 c1143o2) {
        final C1130n c1130n = (C1130n) list.get(c1053i2.m968a());
        if (c1130n.m1877g().size() == 1) {
            final int i = 0;
            AbstractC1000d.m506a(this, MaxDebuggerAdUnitDetailActivity.class, c1220k.m2893e(), new AbstractC1000d.b() { // from class: com.applovin.impl.o0000Ooo
                @Override // com.applovin.impl.AbstractC1000d.b
                /* renamed from: a */
                public final void mo327a(Activity activity) {
                    switch (i) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1130n, null, null, c1220k);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1130n, c1220k);
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            AbstractC1000d.m506a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, c1220k.m2893e(), new AbstractC1000d.b() { // from class: com.applovin.impl.o0000Ooo
                @Override // com.applovin.impl.AbstractC1000d.b
                /* renamed from: a */
                public final void mo327a(Activity activity) {
                    switch (i2) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1130n, null, null, c1220k);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1130n, c1220k);
                            break;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private List m2119a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1130n c1130n = (C1130n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1130n.m1873c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1130n.m1872b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(C1143o2.m1979a(C1143o2.c.DETAIL).m1997b(StringUtils.createSpannedString(c1130n.m1874d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).m1992a(new SpannedString(spannableStringBuilder)).m1991a(this).m1994a(true).m1995a());
        }
        return arrayList;
    }
}
