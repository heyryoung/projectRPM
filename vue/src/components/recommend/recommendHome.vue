<template>
<div>
<template>
<component :is="'Tab'"></component>
</template>
<template>

<router-view name="content"/>

</template>
</div>
</template>
<script>

import Tab from "@/components/recommend/recommendTab.vue"

export default{
	components:{Tab}
}
</script>
<style scoped></style>