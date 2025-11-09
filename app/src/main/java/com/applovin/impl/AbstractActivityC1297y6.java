package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.y6 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1297y6 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f3161a;

    /* renamed from: b */
    private String f3162b;

    /* renamed from: c */
    private String f3163c;

    /* renamed from: a */
    private void m3803a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f3163c);
        intent.putExtra("android.intent.extra.TITLE", this.f3162b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f3162b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f3161a;
    }

    public void initialize(String str, String str2, C1220k c1220k) {
        this.f3161a = c1220k;
        this.f3162b = str;
        this.f3163c = str2;
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f3162b);
        ((TextView) findViewById(C1333R.id.textView)).setText(this.f3163c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1333R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C1333R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3803a();
        return true;
    }
}
