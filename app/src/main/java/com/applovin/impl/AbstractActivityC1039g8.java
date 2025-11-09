package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.g8 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1039g8 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private String f785a;

    /* renamed from: b */
    private C1220k f786b;

    /* renamed from: c */
    private AbstractViewOnClickListenerC1152p2 f787c;

    /* renamed from: com.applovin.impl.g8$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ List f788e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f788e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: a */
        public C1143o2 mo130a() {
            return new C1143o2.b(C1143o2.c.SECTION_CENTERED).m2003d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").m1995a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return this.f788e;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return this.f788e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return new C1250t4("SEGMENT TARGETING");
        }
    }

    /* renamed from: a */
    private List m812a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1143o2.m1979a(C1143o2.c.DETAIL).m2003d((String) it.next()).m1995a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f786b;
    }

    public void initialize(String str, List<String> list, C1220k c1220k) {
        this.f785a = str;
        this.f786b = c1220k;
        a aVar = new a(this, m812a(list));
        this.f787c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle(this.f785a);
        ((ListView) findViewById(C1333R.id.listView)).setAdapter((ListAdapter) this.f787c);
    }
}
