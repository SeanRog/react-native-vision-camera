package com.mrousavy.camera;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;

import com.mrousavy.camera.frameprocessor.FrameProcessorPlugin;

import org.jetbrains.annotations.NotNull;

public class QRCodeFrameProcessorPlugin extends FrameProcessorPlugin {
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public Object callback(@NonNull @NotNull ImageProxy image, @NonNull @NotNull Object[] params) {
        return null;
    }

    QRCodeFrameProcessorPlugin() {
        super("scanQRCodes");
    }
}
