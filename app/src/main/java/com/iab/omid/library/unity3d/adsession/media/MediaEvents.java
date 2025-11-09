package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2595h;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2609g;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MediaEvents {
    private final C2580a adSession;

    private MediaEvents(C2580a c2580a) {
        this.adSession = c2580a;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C2580a c2580a = (C2580a) adSession;
        C2609g.m4654a(adSession, "AdSession is null");
        C2609g.m4661f(c2580a);
        C2609g.m4658c(c2580a);
        C2609g.m4657b(c2580a);
        C2609g.m4663h(c2580a);
        MediaEvents mediaEvents = new MediaEvents(c2580a);
        c2580a.getAdSessionStatePublisher().m4599a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) throws JSONException {
        C2609g.m4654a(interactionType, "InteractionType is null");
        C2609g.m4653a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m4602a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("bufferFinish");
    }

    public void bufferStart() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("bufferStart");
    }

    public void complete() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("complete");
    }

    public void firstQuartile() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("firstQuartile");
    }

    public void midpoint() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("midpoint");
    }

    public void pause() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("pause");
    }

    public void playerStateChange(PlayerState playerState) throws JSONException {
        C2609g.m4654a(playerState, "PlayerState is null");
        C2609g.m4653a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m4602a("playerStateChange", jSONObject);
    }

    public void resume() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("resume");
    }

    public void skipped() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("skipped");
    }

    public void start(float f, float f2) throws JSONException {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C2609g.m4653a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C2605c.m4631a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C2605c.m4631a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2595h.m4578c().m4580b()));
        this.adSession.getAdSessionStatePublisher().m4602a("start", jSONObject);
    }

    public void thirdQuartile() {
        C2609g.m4653a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4600a("thirdQuartile");
    }

    public void volumeChange(float f) throws JSONException {
        confirmValidVolume(f);
        C2609g.m4653a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C2605c.m4631a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2595h.m4578c().m4580b()));
        this.adSession.getAdSessionStatePublisher().m4602a("volumeChange", jSONObject);
    }
}
