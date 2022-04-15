<template>
	<view class="u-page">
		<u-list @scrolltolower="scrolltolower">
			<!-- <u-list-item v-for="(item, index) in indexList" :key="index">
					<u-cell :title="`列表长度-${index + 1}`">
					<u-avatar slot="icon" shape="square" size="35" :src="item.url"
						customStyle="margin: -3px 5px -3px 0"></u-avatar>
				
				</u-cell>
				
			</u-list-item> -->
			<view class="u-demo-block">
				<text class="u-demo-block__title">1401</text>
				<!-- <text class="u-block__title">1401</text> -->
				<view>
					<view class="u-page__checkbox-item">
						<u-checkbox-group v-model="checkboxValue7" @change="checkboxChange" :borderBottom="true"
							placement="column" iconPlacement="right">
							<u-checkbox :customStyle="{marginBottom: '16px'}" v-for="(item, index) in checkboxList7"
								:key="index" :label="item.name" :name="item.name">
							</u-checkbox>
						</u-checkbox-group>
					</view>
				</view>
			</view>
			<view class="u-demo-block">
				<text class="u-demo-block__title">1461</text>
				<!-- <text class="u-block__title">1401</text> -->
				<view>
					<view class="u-page__checkbox-item">
						<u-checkbox-group v-model="checkboxValue7" @change="checkboxChange" :borderBottom="true"
							placement="column" iconPlacement="right">
							<u-checkbox :customStyle="{marginBottom: '16px'}" v-for="(item, index) in checkboxList7"
								:key="index" :label="item.name" :name="item.name">
							</u-checkbox>
						</u-checkbox-group>
					</view>
				</view>
			</view>
			<view class="u-demo-block">
				<text class="u-demo-block__title">1459</text>
				<!-- <text class="u-block__title">1401</text> -->
				<view>
					<view class="u-page__checkbox-item">
						<u-checkbox-group v-model="checkboxValue7" @change="checkboxChange" :borderBottom="true"
							placement="column" iconPlacement="right">
							<u-checkbox :customStyle="{marginBottom: '16px'}" v-for="(item, index) in checkboxList7"
								:key="index" :label="item.name" :name="item.name">
							</u-checkbox>
						</u-checkbox-group>
					</view>
				</view>
			</view>
			<view class="u-demo-block">
				<text class="u-demo-block__title">1459</text>
				<!-- <text class="u-block__title">1401</text> -->
				<view>
					<view class="u-page__checkbox-item">
						<u-checkbox-group v-model="checkboxValue7" @change="checkboxChange" :borderBottom="true"
							placement="column" iconPlacement="right">
							<u-checkbox :customStyle="{marginBottom: '16px'}" v-for="(item, index) in checkboxList7"
								:key="index" :label="item.name" :name="item.name">
							</u-checkbox>
						</u-checkbox-group>
					</view>
				</view>
			</view>
		</u-list>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				indexList: [],
				urls: [
					'https://cdn.uviewui.com/uview/album/1.jpg',
					'https://cdn.uviewui.com/uview/album/2.jpg',
					'https://cdn.uviewui.com/uview/album/3.jpg',
					'https://cdn.uviewui.com/uview/album/4.jpg',
					'https://cdn.uviewui.com/uview/album/5.jpg',
					'https://cdn.uviewui.com/uview/album/6.jpg',
					'https://cdn.uviewui.com/uview/album/7.jpg',
					'https://cdn.uviewui.com/uview/album/8.jpg',
					'https://cdn.uviewui.com/uview/album/9.jpg',
					'https://cdn.uviewui.com/uview/album/10.jpg',
				],
				//横向排列形式数据
				checkboxList6: [{
						name: '送达',
						disabled: false
					},
					{
						name: '已付',
						disabled: false
					},
					{
						name: '轮船',
						disabled: false
					},
					{
						name: '飞机',
						disabled: false
					}
				],
				// u-checkbox-group的v-model绑定的值如果设置为某个checkbox的name，就会被默认选中
				checkboxValue6: ['送达', '轮船'],
				//横向两端排列形式
				checkboxList7: [{
						name: '31#604 份数，复制到群@，电话号码复制，姓名',
						disabled: false
					}, {
						name: '31#504',
						disabled: false
					},
					{
						name: '31#603',
						disabled: false
					},
					{
						name: '31#601',
						disabled: false
					},
					{
						name: '31#602',
						disabled: false
					}
				],
				// u-checkbox-group的v-model绑定的值如果设置为某个checkbox的name，就会被默认选中
				checkboxValue7: ['31#603', '31#601'],
			}
		},
		onLoad() {
			this.loadmore()
		},
		methods: {
			scrolltolower() {
				this.loadmore()
			},
			loadmore() {
				for (let i = 0; i < 30; i++) {
					this.indexList.push({
						url: this.urls[uni.$u.random(0, this.checkboxList7.length - 1)]
					})
				}
			},
			checkboxChange(n) {
				// console.log('change', n);
			}
		},
	}
</script>

<style lang="scss">
	.u-page {}
</style>
