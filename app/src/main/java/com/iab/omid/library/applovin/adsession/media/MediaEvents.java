package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2496i;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2511g;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MediaEvents {
    private final C2480a adSession;

    private MediaEvents(C2480a c2480a) {
        this.adSession = c2480a;
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
        C2480a c2480a = (C2480a) adSession;
        C2511g.m4162a(adSession, "AdSession is null");
        C2511g.m4169f(c2480a);
        C2511g.m4166c(c2480a);
        C2511g.m4165b(c2480a);
        C2511g.m4171h(c2480a);
        MediaEvents mediaEvents = new MediaEvents(c2480a);
        c2480a.m3987d().m4104a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C2511g.m4162a(interactionType, "InteractionType is null");
        C2511g.m4161a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, "interactionType", interactionType);
        this.adSession.m3987d().m4107a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("bufferFinish");
    }

    public void bufferStart() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("bufferStart");
    }

    public void complete() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("complete");
    }

    public void firstQuartile() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("firstQuartile");
    }

    public void midpoint() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("midpoint");
    }

    public void pause() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("pause");
    }

    public void playerStateChange(PlayerState playerState) throws JSONException {
        C2511g.m4162a(playerState, "PlayerState is null");
        C2511g.m4161a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, "state", playerState);
        this.adSession.m3987d().m4107a("playerStateChange", jSONObject);
    }

    public void resume() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("resume");
    }

    public void skipped() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C2511g.m4161a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C2507c.m4137a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C2507c.m4137a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2496i.m4077c().m4079b()));
        this.adSession.m3987d().m4107a("start", jSONObject);
    }

    public void thirdQuartile() {
        C2511g.m4161a(this.adSession);
        this.adSession.m3987d().m4105a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C2511g.m4161a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C2507c.m4137a(jSONObject, C3034d9.i.f8161P, Float.valueOf(C2496i.m4077c().m4079b()));
        this.adSession.m3987d().m4107a("volumeChange", jSONObject);
    }
}
