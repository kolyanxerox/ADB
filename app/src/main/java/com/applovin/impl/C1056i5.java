package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.List;

/* renamed from: com.applovin.impl.i5 */
/* loaded from: classes.dex */
public class C1056i5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final List f905g;

    /* renamed from: h */
    private final Activity f906h;

    public C1056i5(List list, Activity activity, C1220k c1220k) {
        super("TaskAutoInitAdapters", c1220k, true);
        this.f905g = list;
        this.f906h = activity;
    }

    /* renamed from: a */
    public /* synthetic */ void m1003a(C1044h3 c1044h3) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Auto-initing adapter: " + c1044h3);
        }
        this.f776a.m2852S().m1769a(c1044h3, this.f906h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f905g.size() > 0) {
            if (C1240o.m3200a()) {
                C1240o c1240o = this.f778c;
                String str = this.f777b;
                StringBuilder sb = new StringBuilder("Auto-initing ");
                sb.append(this.f905g.size());
                sb.append(" adapters");
                sb.append(this.f776a.m2922t0().m493c() ? " in test mode" : "");
                sb.append("...");
                c1240o.m3211a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f776a.m2857V())) {
                this.f776a.m2850Q0();
            } else if (!this.f776a.m2838H0()) {
                C1240o.m3207h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f776a.m2857V());
            }
            if (this.f906h == null) {
                C1240o.m3207h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (C1044h3 c1044h3 : this.f905g) {
                if (c1044h3.m922s()) {
                    this.f776a.m2918r0().m407a(new OooO(8, this, c1044h3), C0987b6.b.MEDIATION);
                } else {
                    this.f776a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f776a.m2847O().m3211a(this.f777b, "Skipping eager auto-init for adapter " + c1044h3);
                    }
                }
            }
        }
    }
}
