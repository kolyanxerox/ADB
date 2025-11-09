package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.n1 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1132n1 extends Activity {

    /* renamed from: a */
    private C1151p1 f1512a;

    /* renamed from: b */
    private C1220k f1513b;

    /* renamed from: c */
    private TextView f1514c;

    /* renamed from: d */
    private Button f1515d;

    /* renamed from: b */
    private void m1884b() {
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2367a(this.f1513b.m2933z().m546a(this.f1512a));
        String strM549b = this.f1513b.m2933z().m549b(this.f1512a.m2053a());
        if (strM549b != null) {
            c1186s2.m2367a("\nBid Response Preview:\n");
            c1186s2.m2367a(strM549b);
        }
        TextView textView = (TextView) findViewById(C1333R.id.email_report_tv);
        this.f1514c = textView;
        textView.setText(c1186s2.toString());
        this.f1514c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    public void m1885a(C1151p1 c1151p1, C1220k c1220k) {
        this.f1512a = c1151p1;
        this.f1513b = c1220k;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m1883a()) {
            finish();
            return;
        }
        setTitle(this.f1512a.m2055c() + " - " + this.f1512a.m2056d());
        setContentView(C1333R.layout.creative_debugger_displayed_ad_detail_activity);
        m1884b();
        AbstractC0989b8.m427a(findViewById(R.id.content), this.f1513b);
        Button button = (Button) findViewById(C1333R.id.report_ad_button);
        this.f1515d = button;
        button.setOnClickListener(new Oooo000(this, 1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1333R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!m1883a()) {
            finish();
            return false;
        }
        if (C1333R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f1513b.m2933z().m548a(this.f1512a, (Context) this, false);
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void m1882a(View view) {
        this.f1513b.m2933z().m548a(this.f1512a, (Context) this, true);
    }

    /* renamed from: a */
    private boolean m1883a() {
        return (this.f1512a == null || this.f1513b == null) ? false : true;
    }
}
