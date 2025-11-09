package com.applovin.impl.sdk.network;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1146o5;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C1220k f2258a;

    public PostbackServiceImpl(C1220k c1220k) {
        this.f2258a = c1220k;
    }

    /* renamed from: a */
    private boolean m3071a(C1239e c1239e) {
        Map mapM3084i = c1239e.m3084i();
        if (mapM3084i == null) {
            return false;
        }
        Object obj = mapM3084i.get(NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = mapM3084i.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C1239e.m3176b(this.f2258a).mo3103b(str).mo3100a(false).mo3101a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C1239e c1239e, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(c1239e, C0987b6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(C1239e c1239e, C0987b6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        C1146o5 c1146o5 = new C1146o5(c1239e, bVar, this.f2258a, appLovinPostbackListener);
        c1146o5.m794a(m3071a(c1239e));
        this.f2258a.m2918r0().m403a((AbstractRunnableC1036g5) c1146o5, bVar);
    }
}
