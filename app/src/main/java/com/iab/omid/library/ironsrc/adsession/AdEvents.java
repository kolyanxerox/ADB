package com.iab.omid.library.ironsrc.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.utils.C2562g;

/* loaded from: classes2.dex */
public final class AdEvents {
    private final C2531a adSession;

    private AdEvents(C2531a c2531a) {
        this.adSession = c2531a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C2531a c2531a = (C2531a) adSession;
        C2562g.m4415a(adSession, "AdSession is null");
        C2562g.m4423g(c2531a);
        C2562g.m4418b(c2531a);
        AdEvents adEvents = new AdEvents(c2531a);
        c2531a.getAdSessionStatePublisher().m4352a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C2562g.m4418b(this.adSession);
        C2562g.m4421e(this.adSession);
        if (!this.adSession.m4244f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m4244f()) {
            this.adSession.m4249k();
        }
    }

    public void loaded() {
        C2562g.m4414a(this.adSession);
        C2562g.m4421e(this.adSession);
        this.adSession.m4250l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C2562g.m4415a(vastProperties, "VastProperties is null");
        C2562g.m4414a(this.adSession);
        C2562g.m4421e(this.adSession);
        this.adSession.m4240a(vastProperties.m4251a());
    }
}
