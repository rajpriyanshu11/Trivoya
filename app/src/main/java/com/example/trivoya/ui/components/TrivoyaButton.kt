package com.example.trivoya.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@Composable
fun TrivoyaFilledBtn(
   modifier: Modifier = Modifier,
   text: String,
   onClick: () -> Unit,
   colors: ButtonColors = ButtonDefaults.buttonColors(),
) {
   Button(onClick = onClick, modifier = modifier,colors=colors) {
      Text(text)
   }
}

@Composable
fun TrivoyaFilledTonalBtn(
   modifier: Modifier = Modifier,
   text: String,
   onClick: () -> Unit,
//   colors: ButtonColors = ButtonDefaults.buttonColors(),
) {
   FilledTonalButton(onClick = onClick, modifier = modifier) {
      Text(text)
   }
}

@Composable
fun TrivoyaOutlinedBtn(
   onClick: () -> Unit,
   text: String,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   shape: androidx.compose.ui.graphics.Shape = ButtonDefaults.outlinedShape,
   colors: ButtonColors = ButtonDefaults.outlinedButtonColors(),
   elevation: ButtonElevation? = null,
   border: BorderStroke? = ButtonDefaults.outlinedButtonBorder(enabled),
   contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
   interactionSource: MutableInteractionSource? = null
) {
   OutlinedButton(
      onClick = onClick,
      modifier = modifier,
      enabled = enabled,
      shape = shape,
      colors = colors,
      elevation = elevation,
      border = border,
      contentPadding = contentPadding,
      interactionSource = interactionSource
   ) {
      Text(text = text)
   }
}


@Composable
fun TrivoyaElevatedBtn(
   text: String,
   onClick: () -> Unit,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   colors: ButtonColors = ButtonDefaults.elevatedButtonColors(),
   shape: androidx.compose.ui.graphics.Shape = ButtonDefaults.elevatedShape,
   elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(),
   contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
) {
   ElevatedButton(
      onClick = onClick,
      modifier = modifier,
      enabled = enabled,
      shape = shape,
      colors = colors,
      elevation = elevation,
      contentPadding = contentPadding
   ) {
      Text(text)
   }
}


@Composable
fun TrivoyaTextButton(
   onClick: () -> Unit,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   shape: Shape = ButtonDefaults.textShape,
   colors: ButtonColors = ButtonDefaults.textButtonColors(),
   elevation: ButtonElevation? = null,
   border: BorderStroke? = null,
   contentPadding: PaddingValues = ButtonDefaults.TextButtonContentPadding,
   interactionSource: MutableInteractionSource? = null,
   content: @Composable RowScope.() -> Unit
) {
   TextButton(
      onClick = onClick,
      modifier = modifier,
      enabled = enabled,
      shape = shape,
      colors = colors,
      elevation = elevation,
      border = border,
      contentPadding = contentPadding,
      interactionSource = interactionSource,
      content = content
   )
}


@Composable
fun TrivoyaOutlinedIconButton(
   onClick: () -> Unit,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   shape: androidx.compose.ui.graphics.Shape = ButtonDefaults.elevatedShape,
   colors: IconButtonColors = IconButtonDefaults.outlinedIconButtonColors(),
   border: BorderStroke? = IconButtonDefaults.outlinedIconButtonBorder(enabled),
   interactionSource: MutableInteractionSource? = null,
   icon: @Composable () -> Unit
) {
   OutlinedIconButton(
      onClick = onClick,
      modifier = modifier,
      enabled = enabled,
      shape = shape,
      colors = colors,
      border = border,
      interactionSource = interactionSource,
      content = icon
   )
}

@Composable
fun TrivoyaOutlinedIconToggleButton(
   checked: Boolean,
   onCheckedChange: (Boolean) -> Unit,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   shape: androidx.compose.ui.graphics.Shape = ButtonDefaults.elevatedShape,
   colors: IconToggleButtonColors = IconButtonDefaults.outlinedIconToggleButtonColors(),
   border: BorderStroke? = IconButtonDefaults.outlinedIconToggleButtonBorder(enabled, checked),
   interactionSource: MutableInteractionSource? = null,
   icon: @Composable () -> Unit
) {
   OutlinedIconToggleButton(
      checked = checked,
      onCheckedChange = onCheckedChange,
      modifier = modifier,
      enabled = enabled,
      shape = shape,
      colors = colors,
      border = border,
      interactionSource = interactionSource,
      content = icon
   )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun TrivoyaOutlinedToggleButton(
   checked: Boolean,
   onCheckedChange: (Boolean) -> Unit,
   modifier: Modifier = Modifier,
   enabled: Boolean = true,
   shapes: ToggleButtonShapes = ToggleButtonDefaults.shapesFor(ButtonDefaults.MinHeight),
   colors: ToggleButtonColors = ToggleButtonDefaults.outlinedToggleButtonColors(),
   elevation: ButtonElevation? = null,
   border: BorderStroke? = if (!checked) ButtonDefaults.outlinedButtonBorder(enabled) else null,
   contentPadding: PaddingValues = ButtonDefaults.contentPaddingFor(ButtonDefaults.MinHeight),
   interactionSource: MutableInteractionSource? = null,
   content: @Composable RowScope.() -> Unit
) {
   OutlinedToggleButton(
      checked = checked,
      onCheckedChange = onCheckedChange,
      modifier = modifier,
      enabled = enabled,
      shapes = shapes,
      colors = colors,
      elevation = elevation,
      border = border,
      contentPadding = contentPadding,
      interactionSource = interactionSource,
      content = content
   )
}

@Composable
fun TrivoyaFAB(
   onClick: () -> Unit,
   modifier: Modifier = Modifier,
   shape: Shape = FloatingActionButtonDefaults.shape,
   containerColor: androidx.compose.ui.graphics.Color = FloatingActionButtonDefaults.containerColor,
   contentColor: androidx.compose.ui.graphics.Color = contentColorFor(containerColor),
   elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
   interactionSource: MutableInteractionSource? = null,
   content: @Composable () -> Unit
){
   FloatingActionButton(
      onClick = onClick,
      modifier = modifier,
      shape = shape,
      containerColor = containerColor,
      contentColor = contentColor,
      elevation = elevation,
      interactionSource = interactionSource,
      content = content
   )
}

@Composable
fun TrivoyaSmallFAB(
   onClick: () -> Unit,
   modifier: Modifier = Modifier,
   shape: Shape = FloatingActionButtonDefaults.smallShape,
   containerColor: androidx.compose.ui.graphics.Color = FloatingActionButtonDefaults.containerColor,
   contentColor: androidx.compose.ui.graphics.Color = contentColorFor(containerColor),
   elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
   interactionSource: MutableInteractionSource? = null,
   content: @Composable () -> Unit
) {
   SmallFloatingActionButton(
      onClick = onClick,
      modifier = modifier,
      shape = shape,
      containerColor = containerColor,
      contentColor = contentColor,
      elevation = elevation,
      interactionSource = interactionSource,
      content = content
   )
}

//@Composable
//fun ExtendedFloatingActionButton(
//   onClick: () -> Unit,
//   modifier: Modifier = Modifier,
//   shape: Shape = FloatingActionButtonDefaults.extendedFabShape,
//   containerColor: Color = FloatingActionButtonDefaults.containerColor,
//   contentColor: Color = contentColorFor(containerColor),
//   elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
//   interactionSource: MutableInteractionSource? = null,
//   content: @Composable RowScope.() -> Unit
//): Unit

