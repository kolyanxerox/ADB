package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2547i;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2562g;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MediaEvents {
    private final C2531a adSession;

    private MediaEvents(C2531a c2531a) {
        this.adSession = c2531a;
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
        C2531a c2531a = (C2531a) adSession;
        C2562g.m4415a(adSession, "AdSession is null");
        C2562g.m4422f(c2531a);
        C2562g.m4419c(c2531a);
        C2562g.m4418b(c2531a);
        C2562g.m4424h(c2531a);
        MediaEvents mediaEvents = new MediaEvents(c2531a);
        c2531a.getAdSessionStatePublisher().m4357a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) throws JSONException {
        C2562g.m4415a(interactionType, "InteractionType is null");
        C2562g.m4414a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m4360a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("bufferFinish");
    }

    public void bufferStart() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("bufferStart");
    }

    public void complete() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("complete");
    }

    public void firstQuartile() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("firstQuartile");
    }

    public void midpoint() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("midpoint");
    }

    public void pause() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("pause");
    }

    public void playerStateChange(PlayerState playerState) throws JSONException {
        C2562g.m4415a(playerState, "PlayerState is null");
        C2562g.m4414a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m4360a("playerStateChange", jSONObject);
    }

    public void resume() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("resume");
    }

    public void skipped() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("skipped");
    }

    public void start(float f, float f2) throws JSONException {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C2562g.m4414a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C2558c.m4390a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C2558c.m4390a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2547i.m4330c().m4332b()));
        this.adSession.getAdSessionStatePublisher().m4360a("start", jSONObject);
    }

    public void thirdQuartile() {
        C2562g.m4414a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m4358a("thirdQuartile");
    }

    public void volumeChange(float f) throws JSONException {
        confirmValidVolume(f);
        C2562g.m4414a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C2558c.m4390a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2547i.m4330c().m4332b()));
        this.adSession.getAdSessionStatePublisher().m4360a("volumeChange", jSONObject);
    }
}
