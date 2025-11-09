package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15274OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f15275OooOo0o;

    public /* synthetic */ OooO0o(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.f15274OooOo0O = i;
        this.f15275OooOo0o = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15274OooOo0O) {
            case 0:
                this.f15275OooOo0o.createMetadata();
                break;
            default:
                this.f15275OooOo0o.loadInternal();
                break;
        }
    }
}
