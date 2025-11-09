package com.iab.omid.library.unity3d.adsession.media;

import com.ironsource.C3069e9;

/* loaded from: classes2.dex */
public enum InteractionType {
    CLICK(C3069e9.f8387d),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
