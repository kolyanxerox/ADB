package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.v3 */
/* loaded from: classes.dex */
public class C1267v3 extends BroadcastReceiver {

    /* renamed from: a */
    private final List f2529a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.v3$a */
    public interface a {
        /* renamed from: a */
        void mo2935a();

        /* renamed from: b */
        void mo2936b();
    }

    public C1267v3(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    public void m3546a(a aVar) {
        this.f2529a.add(aVar);
    }

    /* renamed from: b */
    public void m3547b(a aVar) {
        this.f2529a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f2529a);
        int i = 0;
        if (m3545a(intent)) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((a) obj).mo2935a();
            }
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((a) obj2).mo2936b();
        }
    }

    /* renamed from: a */
    private static boolean m3545a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }
}
