package com.iab.omid.library.unity3d.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.media.VastProperties;
import com.iab.omid.library.unity3d.utils.C2609g;

/* loaded from: classes2.dex */
public final class AdEvents {
    private final C2580a adSession;

    private AdEvents(C2580a c2580a) {
        this.adSession = c2580a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C2580a c2580a = (C2580a) adSession;
        C2609g.m4654a(adSession, "AdSession is null");
        C2609g.m4662g(c2580a);
        C2609g.m4657b(c2580a);
        AdEvents adEvents = new AdEvents(c2580a);
        c2580a.getAdSessionStatePublisher().m4594a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C2609g.m4657b(this.adSession);
        C2609g.m4660e(this.adSession);
        if (!this.adSession.m4500f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m4500f()) {
            this.adSession.m4505k();
        }
    }

    public void loaded() {
        C2609g.m4653a(this.adSession);
        C2609g.m4660e(this.adSession);
        this.adSession.m4506l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C2609g.m4654a(vastProperties, "VastProperties is null");
        C2609g.m4653a(this.adSession);
        C2609g.m4660e(this.adSession);
        this.adSession.m4496a(vastProperties.m4507a());
    }
}
