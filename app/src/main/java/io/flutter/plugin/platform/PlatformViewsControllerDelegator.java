package io.flutter.plugin.platform;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.view.AccessibilityBridge;

/* loaded from: classes3.dex */
public class PlatformViewsControllerDelegator implements PlatformViewsAccessibilityDelegate {
    PlatformViewsController platformViewsController;
    PlatformViewsController2 platformViewsController2;

    public PlatformViewsControllerDelegator(PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
        this.platformViewsController = platformViewsController;
        this.platformViewsController2 = platformViewsController2;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(@NonNull AccessibilityBridge accessibilityBridge) {
        this.platformViewsController.attachAccessibilityBridge(accessibilityBridge);
        this.platformViewsController2.attachAccessibilityBridge(accessibilityBridge);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.platformViewsController.detachAccessibilityBridge();
        this.platformViewsController2.detachAccessibilityBridge();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    @Nullable
    public View getPlatformViewById(int i) {
        return this.platformViewsController2.getPlatformViewById(i) != null ? this.platformViewsController2.getPlatformViewById(i) : this.platformViewsController.getPlatformViewById(i);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i) {
        return this.platformViewsController2.getPlatformViewById(i) != null ? this.platformViewsController2.usesVirtualDisplay(i) : this.platformViewsController.usesVirtualDisplay(i);
    }
}
